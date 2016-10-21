insert into egresados.t_sectorlaboral(ID_SECTORLABORAL,NOM_SECTORLABORAL) values (24,'Otra cosa')
insert into egresados.t_departamento(ID_DEPARTAMENTO,NOMBRE_DEPARTAMENTO) values (74,'Antioquia')
insert into egresados.t_ciudad(ID_CIUDAD,NOM_CIUDAD,ID_DEPARTAMENTO) values (55,'Envigado',74)
insert into egresados.t_empresa(ID_EMPRESA,CIUDAD,DEPARTAMENTO,DIRECCION,FAX,NIT,PAIS,RAZON_SOCIAL,SITIO_WEB,TELEFONO,TIPO_EMPRESA,ID_CIUDAD,ID_SECTOR) values (98,'Envigado','Antioquia','cra 13','732','12345','Colombia','no se','cualquiercosa@gmail.com','33333','Privada',55,24)
