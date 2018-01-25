CREATE TABLE TaiKhoan (
  username  VARCHAR(100),
  password  VARCHAR(100),
  ten       NVARCHAR(100),
  diem      INT,
  thoigian  VARCHAR(100),
  thanhtich VARCHAR(100),
  namsinh   VARCHAR(100),
  email     VARCHAR(1000),
  facebook  VARCHAR(1000),
  baidalam  NVARCHAR(2000),
  gioithieu NVARCHAR(1000),
  role      VARCHAR(100),
  PRIMARY KEY (username)
);

CREATE TABLE Submitsion (
  mabaicode VARCHAR(100),
  username  VARCHAR(100),
  diem      INT,
  thoigian  VARCHAR(100),
  PRIMARY KEY (mabaicode, thoigian)
);

CREATE TABLE monhoc (
  mamonhoc  VARCHAR(100),
  tenmonhoc VARCHAR(100),
  PRIMARY KEY (mamonhoc)
);

CREATE TABLE tracnghiem (
  macauhoi  VARCHAR(100),
  cauhoi    NVARCHAR(3000),
  dapanA    VARCHAR(300),
  dapanB    VARCHAR(300),
  dapanC    VARCHAR(300),
  dapanD    VARCHAR(300),
  dapAnDung VARCHAR(300),
  mamonhoc  VARCHAR(100),
  thoigian  VARCHAR(100),
  mucdo     INT,
  username  VARCHAR(100),
  PRIMARY KEY (macauhoi),
  CONSTRAINT k3 FOREIGN KEY (username) REFERENCES TaiKhoan (username)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

  CONSTRAINT k4 FOREIGN KEY (mamonhoc) REFERENCES monhoc (mamonhoc)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE baicode (
  mabaicode      VARCHAR(100),
  tenbaicode     NVARCHAR(300),
  noidung        NVARCHAR(3000),
  loaibai        VARCHAR(100),
  chuong         VARCHAR(100),
  dulieutest     NVARCHAR(2000),
  dulieuoutput   VARCHAR(1000),
  vietlaihammain NVARCHAR(3000),
  interface      NVARCHAR(3000),
  superclass     NVARCHAR(3000),
  generic        NVARCHAR(3000),
  rangbuoc       VARCHAR(100),
  tenphuongthuc  VARCHAR(1000),
  danhsachthamso VARCHAR(1000),
  thoigian       VARCHAR(100),
  thongtinthem   NVARCHAR(2000),
  mucdo          VARCHAR(100),
  kieutrave      VARCHAR(100),
  username       VARCHAR(100),
  PRIMARY KEY (mabaicode),
  CONSTRAINT k1 FOREIGN KEY (username) REFERENCES TaiKhoan (username)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

