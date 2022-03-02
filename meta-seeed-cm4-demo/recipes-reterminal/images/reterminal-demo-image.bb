require recipes-core/images/rpi-test-image.bb

INHERIT:append = " \
	populate_sdk_qt5 \
	"

SPLASH = "psplash-raspberrypi"

IMAGE_FEATURES:append = " \
	ssh-server-dropbear \
	splash \
	"

IMAGE_INSTALL:append = " \
	kernel-modules \
	kernel-module-mipi-dsi \
	kernel-module-ltr30x \
	kernel-module-lis3lv02d \
	qtbase \
	qtbase-plugins \
	qtbase-tools  \
	qtquickcontrols-qmlplugins \
	qtgraphicaleffects-qmlplugins \
	qtquickcontrols2 \
	ttf-dejavu-sans ttf-dejavu-sans-mono ttf-dejavu-sans-condensed \
	ttf-dejavu-serif ttf-dejavu-serif-condensed ttf-dejavu-common \
	qtcharts \
	qtquicktimeline \
	qtquickdesigner-components \
	python3-pyqt5 \
	python3-logging \
	python3-psutil \
	python3-evdev \
	evtest \
	lvgl \
	iperf3 \
	i2c-tools \
	util-linux \
	"

#	reterminalqt5example