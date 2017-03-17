LICENSE = "GPLv2 & GPLv3 & LGPLv2 & LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552 \
		    file://COPYING3;md5=d32239bcb673463ab874e80d47fae504 \
		    file://COPYING3.LIB;md5=6a6a8e020838b23406c81b19c1d46df6 \
		    file://COPYING.LIB;md5=9f604d8a4f8e74f4f5140845a21b6674"

SRC_URI[md5sum] = "f3b97de919a9dba84490b2e076ec4cb0"
SRC_URI[sha256sum] = "4994ad986726ac4128a6f1bd8020cd672e9a92aa76b80736563ef992992764ef"

SRC_URI += "file://fix-detection-of-64-bit-PPC-inferior-in-gdbserver.patch"
