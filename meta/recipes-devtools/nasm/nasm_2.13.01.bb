SUMMARY = "General-purpose x86 assembler"
SECTION = "devel"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=90904486f8fbf1861cf42752e1a39efe"

SRC_URI = "http://www.nasm.us/pub/nasm/releasebuilds/${PV}/nasm-${PV}.tar.bz2 \
           file://CVE-2017-11111-CVE-2017-17811.patch \
           file://CVE-2017-17819.patch \
           file://CVE-2017-17818.patch \
           file://CVE-2017-17815.patch \
           file://CVE-2017-17810.patch \
           file://CVE-2017-17812.patch \
           file://CVE-2017-17813-CVE-2017-17814-CVE-2017-17816-CVE-2017-17817-CVE-2017-17820.patch \
           file://CVE-2017-17813-CVE-2017-17814-CVE-2017-17816-CVE-2017-17817-CVE-2017-17820-2.patch \
           file://CVE-2018-8881.patch \
           file://CVE-2018-10316.patch \
"

SRC_URI[md5sum] = "1f7d4662040d24351df7d6719ed4f97a"
SRC_URI[sha256sum] = "08f97baf0a7f892128c6413cfa93b69dc5825fbbd06c70928aea028835d198fa"

inherit autotools-brokensep

do_configure_prepend () {
	if [ -f ${S}/aclocal.m4 ] && [ ! -f ${S}/acinclude.m4 ]; then
		mv ${S}/aclocal.m4 ${S}/acinclude.m4
	fi
}

do_install() {
	install -d ${D}${bindir}
	install -d ${D}${mandir}/man1

	oe_runmake 'INSTALLROOT=${D}' install
}

BBCLASSEXTEND = "native"

DEPENDS = "groff-native"
