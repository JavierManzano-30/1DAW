SELECT p.nombre, cl.nombre_club, c.nombre_comp
FROM persona p
INNER JOIN jugador j ON p.codigo_persona = j.codigo_persona
INNER JOIN contrato co ON p.codigo_persona = co.codigo_persona
INNER JOIN clasificacion cl ON co.nombre_club = cl.nombre_club;