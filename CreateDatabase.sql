CREATE TABLE SINHVIEN (
	maSV char(8) not null ,
	hoten nvarchar(30) not null,
	ngaysinh	date not null,
	diachi	varchar(50)not null,
	sdt char(11),
	mail varchar(35),
	gioitinh nvarchar(5)not null,
	noisinh	nvarchar(25)not null,
	cmnd int not null,
	ngaynhaphoc date not null,
	maK char(8) not null,
	maL char(8) not null,
	constraint pk_sv primary key (maSV)
)
CREATE TABLE KHOA(
	maK	char(8)not null,
	matruongkhoa char (8) not null,
	tenK	nvarchar(30) not null,
	constraint pk_khoa primary key (maK)
)
CREATE TABLE MONHOC(
	maMH char(8)not null,
	tenMH nvarchar(30)not null,
	soTC int not null,
	constraint pk_MH primary key (maMH)
)
CREATE TABLE THANNHAN (
	tenTH nvarchar(30)not null,
	maSV char(8)not null,
	sdt int not null,
	diachi nvarchar(50) not null,
	cmnd int not null,
	mail varchar(35) ,
	constraint pk_TN primary key (tenTH,maSV),
	constraint fk_masv foreign key (maSV) references SINHVIEN(maSV)
)
CREATE TABLE LOP(
	maLop char(8) not null,
	tenlop nvarchar(30) not null,
	maGV char(8) not null,
	namBD int not null,
	namKT int not null,
	constraint pk_L primary key (maLop),
)
create table GIAOVIEN(
	maGV char(8) not null,
	tenGV nvarchar(30) not null,
	chucvi nvarchar(15) not null,
	cmnd int not null,
	ngaysinh date not null,
	diachi nvarchar(50)not null,
	sdt int not null,
	mail varchar(30) not null,
	constraint pk_GV primary key (maGV)
)
create table LOPHOCPHAN(
	maGV char(8) not null,
	maMH char(8) not null,
	maSV char(8) not null,
	nam int not null,
	hocky int not null,
	tietBD int not null,
	tietKT int not null,
	constraint pk_LHP primary key (maGV,maMH),
	constraint fk_maGV foreign key (maGV) references GIAOVIEN(maGV),
	constraint fk_maMH foreign key (maMH) references MONHOC(maMH),
	constraint fk_maSV_LHP foreign key (maSV) references SINHVIEN(maSV)
)
alter table SINHVIEN
add constraint fk_maK foreign key (maK) references KHOA(maK),
constraint fk_maL foreign key (maL) references LOP(maL)

alter table KHOA
add constraint fk_matrK foreign key (matruongkhoa) references GIAOVIEN(maGV)
	