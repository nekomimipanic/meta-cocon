PRINC := "${@int(PRINC) + 5}"

# look for files in the layer first
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

dirs755 += " /mnt/realroot /mnt/union /mnt/ram /mnt/oldroot /mnt/newroot /mnt/cfg  /run/pluto "
