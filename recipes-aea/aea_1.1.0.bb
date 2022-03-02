SUMMARY = "A framework for autonomous economic agent (AEA) development"
HOMEPAGE = "https://github.com/fetchai/agents-aea"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=45ac60d501a7b9eec4f4b3c24664e806"

SRC_URI[md5sum] = "7317a7bdf9fbc5a8bf024eec68c1587c"
SRC_URI[sha256sum] = "299bb5c18b2dfd6698d4c45daab215ec5f1feda5f2f4dfe38838369e2e11470c"

PYPI_PACKAGE = "aea"

inherit pypi setuptools3

RDEPENDS_${PN} += " \
"
