SUMMARY = "Base58 and Base58Check implementation."
HOMEPAGE = "https://github.com/keis/base58"
AUTHOR = "David Keijser <keijser@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=71074cfe47bd07c35127d81190aafd41"

SRC_URI[md5sum] = "3595b886f6d57b947fa8d38d4c92e5b3"
SRC_URI[sha256sum] = "c5d0cb3f5b6e81e8e35da5754388ddcc6d0d14b6c6a132cb93d69ed580a7278c"

PYPI_PACKAGE = "base58"

inherit pypi setuptools3
