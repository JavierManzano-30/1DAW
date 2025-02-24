using System;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Net;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace SystemInfoApp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        // Botón 1: Mostrar unidades de disco
        private void button1_Click(object sender, EventArgs e)
        {
            textBox1.Clear();
            foreach (var drive in DriveInfo.GetDrives().Where(d => d.IsReady))
            {
                textBox1.AppendText($"{drive.Name}\n");
            }
        }

        // Botón 2: Mostrar espacio libre de las unidades de disco
        private void button2_Click(object sender, EventArgs e)
        {
            textBox2.Clear();
            foreach (var drive in DriveInfo.GetDrives().Where(d => d.IsReady))
            {
                textBox2.AppendText($"{drive.Name} - Libre: {drive.AvailableFreeSpace / (1024 * 1024 * 1024)} GB\n");
            }
        }

        // Botón 3: Mostrar nombre del equipo
        private void button3_Click(object sender, EventArgs e)
        {
            textBox3.Text = Environment.MachineName;
        }

        // Botón 4: Mostrar memoria RAM (usada y libre)
        private void button4_Click(object sender, EventArgs e)
        {
            var totalMemory = GetTotalMemoryInMB();
            var availableMemory = GetAvailableMemoryInMB();
            var usedMemory = totalMemory - availableMemory;

            textBox4.Text = $"Libre: {availableMemory:F2} MB\nUsada: {usedMemory:F2} MB";
        }

        private double GetTotalMemoryInMB()
        {
            var counter = new PerformanceCounter("Memory", "Commit Limit");
            return counter.NextValue();
        }

        private double GetAvailableMemoryInMB()
        {
            var counter = new PerformanceCounter("Memory", "Available MBytes");
            return counter.NextValue();
        }

        // Botón 5: Mostrar direcciones IP
        private void button5_Click(object sender, EventArgs e)
        {
            textBox5.Clear();
            foreach (var ip in Dns.GetHostAddresses(Dns.GetHostName()))
            {
                textBox5.AppendText($"{ip}\n");
            }
        }

        // Botón 6: Mostrar sistema operativo
        private void button6_Click(object sender, EventArgs e)
        {
            textBox6.Text = $"{Environment.OSVersion.VersionString} ({(Environment.Is64BitOperatingSystem ? "x64" : "x86")})";
        }
    }
}