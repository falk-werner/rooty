SUMMARY = "Rooty image"

IMAGE_INSTALL = "packagegroup-core-boot os-release rooty-keymap coreutils ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

export IMAGE_BASENAME = "rooty-image"

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE:append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "", d)}"
