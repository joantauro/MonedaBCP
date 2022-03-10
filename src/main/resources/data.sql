DROP TABLE IF EXISTS Moneda;
CREATE TABLE Moneda(id INT AUTO_INCREMENT  PRIMARY KEY,
			monedaorigen varchar(250),
			monedadestino varchar(250), 
			tipocambio NUMERIC(20, 2),
			USUARIO_CREACION varchar(250),
			FECHA_CREACION date,
			USUARIO_MODIFICACION varchar(250),
			FECHA_MODIFICACION date
			);

insert into Moneda (monedaorigen,monedadestino,tipocambio,USUARIO_CREACION ,FECHA_CREACION ,USUARIO_MODIFICACION ,FECHA_MODIFICACION ) values ('PEN','USD',0.25,'ADMIN',null,'ADMIN',null);
insert into Moneda (monedaorigen,monedadestino,tipocambio,USUARIO_CREACION ,FECHA_CREACION ,USUARIO_MODIFICACION ,FECHA_MODIFICACION ) values ('PEN','EUR',0.22,'ADMIN',null,'ADMIN',null);

insert into Moneda (monedaorigen,monedadestino,tipocambio,USUARIO_CREACION ,FECHA_CREACION ,USUARIO_MODIFICACION ,FECHA_MODIFICACION ) values ('USD','PEN',4.07,'ADMIN',null,'ADMIN',null);
insert into Moneda (monedaorigen,monedadestino,tipocambio,USUARIO_CREACION ,FECHA_CREACION ,USUARIO_MODIFICACION ,FECHA_MODIFICACION ) values ('USD','EUR', 0.88,'ADMIN',null,'ADMIN',null);

insert into Moneda (monedaorigen,monedadestino,tipocambio,USUARIO_CREACION ,FECHA_CREACION ,USUARIO_MODIFICACION ,FECHA_MODIFICACION ) values ('EUR','USD',1.13,'ADMIN',null,'ADMIN',null);
insert into Moneda (monedaorigen,monedadestino,tipocambio,USUARIO_CREACION ,FECHA_CREACION ,USUARIO_MODIFICACION ,FECHA_MODIFICACION ) values ('EUR','PEN',4.60,'ADMIN',null,'ADMIN',null);
