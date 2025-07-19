# rooty - I am root!

A minimal linux image based on [yocto](https://www.yoctoproject.org/).

## Build

The build process is just like yocto's default build:

```bash
source oe-init-build-env
bitbake rooty-image
```

Find the build results in the `build/tmp/deploy/images/genericx86-64` directory.

## Use on USB drive

To run the rooty image, flash the `rooty-image-generic86-64.wic` file on an USB drive.
The image is bootable on x86-64 machines.
