require recipes-graphics/xorg-driver/xorg-driver-video.inc

inherit pkgconfig

DEPENDS += "xf86miscproto drm xf86driproto"

LIC_FILES_CHKSUM = "file://COPYING;md5=225ca1644e92badb31a40ef755bf2364"

# Patch from buildroot
SRC_URI = "git://anongit.freedesktop.org/xorg/driver/xf86-video-xgixp;protocol=git;branch=master \
           file://xdriver_xf86-video-xgixp-cross-compile.patch"

S = "${WORKDIR}/git"
SRCREV = "e36331f3f2641900efe8363fe3dc15877a72c027"

