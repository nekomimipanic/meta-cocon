FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_libc-musl += "file://10-preload-modules.conf"

