require recipes-graphics/xorg-driver/xorg-driver-video.inc

DEPENDS += " drm xf86driproto libxvmc"
PE = "1"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "d5fe25d3cfa0a64cc77681f15f9c3159"
SRC_URI[archive.sha256sum] = "5026bdaf644178fee66a26190453b0dddb99558b8c97c4a592a482a2434dc862"
