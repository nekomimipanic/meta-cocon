# opencocon master image
DESCRIPTION = "opencocon for Raspberry Pi."
LICENSE = "MIT"

inherit image


IMAGE_PKGTYPE = "ipk"


IMAGE_NAME = "coconrpi-${DISTRO_VERSION}-${MACHINE}"

# TODO : postprocess?
#IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

DISTRO_UPDATE_ALTERNATIVES ?= "${PREFERRED_PROVIDER_virtual/update-alternatives}"

DISTRO_PACKAGE_MANAGER ?= "ipkg ipkg-collateral"
ONLINE_PACKAGE_MANAGEMENT = "no"

# FIXME: We need a distro-indendent way of specifying feed configs.
# Once the RFC for the DISTRO_FEED_CONFIGS variable name is approved,
# we can remove this default definition and set it in the distro config.
#DISTRO_FEED_CONFIGS ?= "${ANGSTROM_FEED_CONFIGS}"


COCON_BASE_PACKAGES = " \
base-files \
base-passwd \
keymaps \
uclibc \
busybox \
opkg \
libgcc \
dialog \
pcmciautils \
usbutils \
wireless-tools \
wpa-supplicant \
update-rc.d \
connman \
connman-plugin-ethernet \
connman-plugin-wifi \
e2fsprogs-badblocks \
e2fsprogs-mke2fs \
e2fsprogs-e2fsck \
udev \
kbd \
kbd-keymaps \
kernel-modules \
consolekit \
"

COCON_XBASE_PACKAGES = " \
xserver-xorg \
xserver-xorg-xephyr \
xserver-xorg-extension-dbe \
xserver-xorg-extension-extmod \
xserver-xorg-module-libint10 \
xserver-xorg-module-libwfb \
xserver-xorg-module-exa \
xserver-xorg-module-xaa \
xserver-xorg-multimedia-modules \
xserver-xorg-fbdev \
xf86-input-evdev \
xf86-video-fbdev \
xauth \
encodings \
font-util \
font-alias \
encodings \
xorg-minimal-fonts \
xinit \
dbus-x11 \
liberation-fonts \
ttf-bitstream-vera \
ttf-vlgothic \
xrandr \
xkeyboard-config \
freetype \
setxkbmap \
xmodmap \
openssh-ssh \
gnome-icon-theme \
hicolor-icon-theme \
xdpyinfo \
x11perf \
"

# Currently exclude driver:
# xf86-video-ati

COCON_XEXT_PACKAGES = " \
libgl \
libglu \
libgbm \
libglapi \
libdrm \
libdrm-kms \
mesa-driver-swrast \
"


COCON_APP_PACKAGES = " \
freerdp \
webkit-gtk \
libvncserver \
openssl \
gnutls \
gnutls-openssl \
libgcrypt \
libgpg-error \
libjpeg-turbo \ 
matchbox-wm \
lxterminal \
lxrandr \
alsa-utils-alsamixer \
alsa-utils-aplay \
alsa-utils-amixer \
alsa-utils-speakertest \
alsa-utils-alsactl \
pulseaudio \
pulseaudio-module-alsa-card \
pulseaudio-module-alsa-sink \
pulseaudio-module-alsa-source \
pulseaudio-module-esound-protocol-tcp \
pulseaudio-module-native-protocol-tcp \
pulseaudio-module-native-protocol-unix \
pulseaudio-module-x11-bell \
pulseaudio-module-mmkbd-evdev \
pulseaudio-module-udev-detect \
pulseaudio-module-x11-publish \
pulseaudio-server \
midori \
cyrus-sasl \
gtk-vnc \
lxpanel \
libwnck \
libnotify \
connman-gnome \
viewnior \
celt \
spice-gtk \
"

COCON_HDDIMAGE_PACKAGES = " \
opencocon-init \
opencocon-init-doc \
"

COCON_NONFREE_FIRMWARE = " \
linux-firmware-ralink \
linux-firmware-realtek \
zd1211-firmware \
userland \
"

RDEPENDS = "${COCON_BASE_PACKAGES} \
${COCON_XBASE_PACKAGES} \
${COCON_XEXT_PACKAGES} \
${COCON_APP_PACKAGES} \
${COCON_HDDIMAGE_PACKAGES} \
${COCON_NONFREE_FIRMWARE} \
"

IMAGE_INSTALL = "${COCON_BASE_PACKAGES} \
${COCON_XBASE_PACKAGES} \
${COCON_XEXT_PACKAGES} \
${COCON_APP_PACKAGES} \
${COCON_HDDIMAGE_PACKAGES} \
${COCON_NONFREE_FIRMWARE} \
"

IMAGE_BASENAME = "coconrpi"
# IMAGE_FSTYPES = " tar.gz squashfs "

#inherit image
