INSERT INTO t_facultad (ID_FACULTAD, NOMBRE_FACULTAD) values (23,'Ciencias Administrativas')
INSERT INTO t_programa (ID_PROGRAMA, nombre_programa, ID_FACULTAD) VALUES (15,'NEGOCIOS',23)
INSERT INTO t_egresado (ID_EGRESADO, APELLIDO,CELULAR,EMAIL,NOMBRE,TELEFONO,tipoDocumento, ID_PROGRAMA) VALUES (1088,'henao','3105940620','k-milo1117@hotmail.com','julian','748','cedula',15)
INSERT INTO t_info_laboral (CARGO_EMPRESA, FECHA_INGRESO, FECHA_SALIDA, NOMBRE_EMPRESA, SECTOR_LABORAL, SITUACION_LABORAL, TIPO_EMPRESA, ID_EGRESADO) VALUES ('GERENTE','2008-10-03 23:19:36','2016-10-03 23:19:36','CAMSOFT','SOFTWARE','INDEPENDIENTE','PUBLICA',1088)