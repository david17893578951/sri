/*==============================================================*/
/* Table: FDI_PERSONA                                           */
/*==============================================================*/
create table FDI_PERSONA (
   PRS_ID               SERIAL               not null,
   PRS_CEDULA           VARCHAR(15)          not null,
   PRS_NOMBRE           VARCHAR(50)          null,
   PRS_APELLIDO         VARCHAR(50)          null,
   PRS_FECHA_NACIMIENTO DATE                 null,
   PRS_NACIONALIDAD     VARCHAR(100)         null,
   PRS_PROVINCIA        VARCHAR(50)          null,
   PRS_CANTON           VARCHAR(50)          null,
   PRS_PARROQUIA        VARCHAR(50)          null,
   PRS_DIR_RECIDENCIA   VARCHAR(300)         null,
   PRS_ESTADO_CIVIL     VARCHAR(30)          null
      constraint CKC_PRS_ESTADO_CIVIL_FDI_PERS check (PRS_ESTADO_CIVIL is null or (PRS_ESTADO_CIVIL in ('S','C','V','D','U'))),
   PRS_ETNIA            VARCHAR(50)          null,
   PRS_SEXO             VARCHAR(15)          null
      constraint CKC_PRS_SEXO_FDI_PERS check (PRS_SEXO is null or (PRS_SEXO in ('M','F'))),
   PRS_GRUPO_SANGUINEO  VARCHAR(10)          null,
   PRS_OCUPACION        VARCHAR(50)          null,
   PRS_TELEFONO         VARCHAR(15)          null,
   PRS_CORREO           VARCHAR(100)         null,
   PRS_DISCAPACIDAD     BOOL                 null,
   PRS_TIPODISCAPACIDAD VARCHAR(100)         null,
   PRS_NOMPADRE         VARCHAR(100)         null,
   PRS_NOMMADRE         VARCHAR(100)         null,
   PRS_TELPADRES        VARCHAR(30)          null,
   PRS_ESTADO           BOOL                 null,
   constraint PK_FDI_PERSONA primary key (PRS_ID),
   constraint AK_K_PRS_CEDULA_FDI_PERS unique (PRS_CEDULA)
);

comment on table FDI_PERSONA is
'Tabla de personas registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_ID is
'Código único asignado a la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_CEDULA is
'Cedula o pasaporte de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_NOMBRE is
'Nombres de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_APELLIDO is
'Apellidos de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_FECHA_NACIMIENTO is
'Fecha de nacimiento de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_PROVINCIA is
'Lugar de nacimiento de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_CANTON is
'Lugar de nacimiento de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_PARROQUIA is
'Lugar de nacimiento de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_ESTADO_CIVIL is
'Estado civil de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_ETNIA is
'Etnia de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_SEXO is
'Sexo de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_GRUPO_SANGUINEO is
'Grupo sanguíneo de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_OCUPACION is
'Ocupación de la persona registradas en la federación deportiva de Imbabura';

comment on column FDI_PERSONA.PRS_TELEFONO is
'Teléfono de la persona registradas en la federación deportiva de Imbabura';

/*==============================================================*/
/* Index: I_PRS_ID                                              */
/*==============================================================*/
create unique index I_PRS_ID on FDI_PERSONA (
PRS_ID
);
