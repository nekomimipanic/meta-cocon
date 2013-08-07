require recipes-graphics/xorg-driver/xorg-driver-video.inc

DESCRIPTION = "X.Org X server -- SiliconMotion display driver"
PE = "2"
PR = "${INC_PR}.0"

LIC_FILES_CHKSUM = "file://COPYING;md5=3893e77db70569921f6d79c387b5748a"

do_compile_prepend() {
        sed -i \
                -e s:'\-O2':'\-O0':g \
                ${S}/src/Makefile
        sed -i \
                -e s:'\-O1':'\-O0':g \
                ${S}/src/Makefile
}

SRC_URI[md5sum] = "b5acd392d799e2bb67ea702a83feb4a0"
SRC_URI[sha256sum] = "a59f1bd21499351b3703c4b77ec007d1299ccb888434d19fabbbeee0a7a14d07"

