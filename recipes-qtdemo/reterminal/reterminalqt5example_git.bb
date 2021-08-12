SUMMARY = "A QT5 demo for seeed reterminal"
DESCRIPTION = "This demo can display the information \
and control the device of the reterminal"
HOMEPAGE = "https://github.com/Seeed-Studio/Seeed_Python_ReTerminalQt5Examples"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRCREV = "${AUTOREV}"

SRC_URI = "git://github.com/Seeed-Studio/Seeed_Python_ReTerminalQt5Examples.git;protocol=git;branch=main \
	"

S = "${WORKDIR}/git"

INSANE_SKIP_${PN} = "file-rdeps"

MY_DESTINATION = "/home/root/Seeed_Python_ReTerminalQt5Examples"
do_install() {
	install -d ${D}${MY_DESTINATION}
	rm -r ${S}/imports/armv7l
	cp -r ${WORKDIR}/git/* ${D}${MY_DESTINATION}
}

FILES_${PN} += "${MY_DESTINATION}/*"