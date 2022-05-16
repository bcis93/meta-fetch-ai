SUMMARY = "A framework for autonomous economic agent (AEA) development"
HOMEPAGE = "https://github.com/fetchai/agents-aea"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=45ac60d501a7b9eec4f4b3c24664e806"

SRC_URI[md5sum] = "042dec992fd9c6b275dc3a96718be31a"
SRC_URI[sha256sum] = "5da42ee688ab214139287c1242e88469c1ddce5be4c87e0c089976317cf65e71"

PYPI_PACKAGE = "aea"

inherit pypi setuptools3

RDEPENDS:${PN} += " python3-base58 \
    python3-jsonschema \
    python3-packaging \
    python3-semver \
    python3-protobuf \
    python3-pymultihash \
    python3-pyyaml \
    python3-requests \
    python3-dotenv \
    python3-ecdsa \
    python3-jsonschema \
    python3-click \
    python3-distutils \
    sqlite3 \
    python3-sqlite3 \
    python3-pip \
    python3-setuptools \
    python3 \
"
