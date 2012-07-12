require recipes-graphics/xorg-driver/xorg-driver-video.inc

DESCRIPTION = "X.org X server -- Trident display driver"
DEPENDS += " xf86dgaproto"
PE = "1"
PR = "${INC_PR}.0"

LIC_FILES_CHKSUM = "file://COPYING;md5=2e9eb6db89324a99415a93a059157da7"


SRC_URI = "git://anongit.freedesktop.org/xorg/driver/xf86-video-trident;protocol=git;branch=master \
          "

S = "${WORKDIR}/git"
SRCREV = "f481290e6dbd73b484cad3e8583031c6e2ccb555"
