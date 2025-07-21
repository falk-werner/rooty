# Configure Busybox

Run `bitbake busybox -c menuconfig` to open configration menu.
Configure busybox, exit and save your changes.

Run `bitbake busybox -c diffconfig` to generate a `.cfg` file which only contains your changes.

Copy generated `.cfg` file to `meta-rooty/recipes-core/busybox/files`.

Add the newly added file to `busybox_%.bbappend`:

```
SRC_URI:append = "file://<some>.cfg"
```