require qt-in-use-common.inc

IMAGE_INSTALL = " \
    ${COMMON_INSTALL} \
    \
    ${XSERVER} \
    x11-common \
    xserver-nodm-init \
    xorg-minimal-fonts \
    liberation-fonts \
    qt-in-industrial-embedded-smarthome \
"
ROOTFS_POSTPROCESS_COMMAND += "(cd ${IMAGE_ROOTFS}/usr/bin ; \
                                ln -s smarthome x-window-manager ) ; \
                                mkdir -p ${IMAGE_ROOTFS}/etc/profile.d ; \
                                echo 'export QT_GRAPHICSSYSTEM=raster' \
                                     > ${IMAGE_ROOTFS}/etc/profile.d/qt-config ;"
