require recipes-graphics/xorg-driver/xorg-driver-video.inc

DESCRIPTION = "X.Org X server -- SiS display driver"
DEPENDS += "xf86miscproto xf86dgaproto drm xf86driproto"

LIC_FILES_CHKSUM = "file://COPYING;md5=cbbdd887d04deb501076c22917e2030d"

# Patch from buildroot and Arch Linux
SRC_URI = "git://anongit.freedesktop.org/xorg/driver/xf86-video-sis;protocol=git;branch=master \
           file://xdriver_xf86-video-sis-0.10.0.patch \
           file://Xi.patch"

S = "${WORKDIR}/git"
SRCREV = "328073e46f9b9fcc09e637c94496c90273a0a4f6"

EXTRA_OECONF += " --enable-dri"
