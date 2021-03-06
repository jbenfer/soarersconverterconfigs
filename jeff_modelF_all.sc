###            XT
###            For the original IBM PC/XT Model F

ifset set1
layerblock
   fn1       1
   fn2       2
endblock

### AT - Model F AT
ifset set2
layerblock
   fn1      1
   fn2      2
endblock

# Base layer remaps time
# need to map the FN key into the base layer (0)
remapblock
# Just for the PC/XT keyboard
ifset set1
layer 0
   PAD_ASTERIX FN1              # first fn key
   SCROLL_LOCK FN2              # second fn key
   PAD_PLUS    PAD_ENTER         # Puts an enter at the far right edge
   CAPS_LOCK    RGUI            # And again
   PAD_1       END               # Hijack the numpad for cursor controls
   PAD_2       DOWN
   PAD_3       PAGE_DOWN
   PAD_4       LEFT
   PAD_5       DOWN            # Impure, but practical when I forget
   PAD_6       RIGHT
   PAD_7       HOME
   PAD_8       UP
   PAD_9       PAGE_UP

# for the PC/AT Keyboard
ifset set2
layer 0
   SCROLL_LOCK FN1              # first fn key
   SYSREQ_ATTN FN2              # second fn key
   PAD_PLUS    PAD_ENTER         # Puts an enter at the far right edge
   CAPS_LOCK   RGUI            # And again
   PAD_1       END               # Hijack the numpad for cursor controls
   PAD_2       DOWN
   PAD_3       PAGE_DOWN
   PAD_4       LEFT
   PAD_5       DOWN            # Impure, but practical when I forget
   PAD_6       RIGHT
   PAD_7       HOME
   PAD_8       UP
   PAD_9       PAGE_UP
   PAD_PERIOD  DELETE
   PAD_0       INSERT
   EXTRA_BACKSLASH BACKSLASH

# Primary Function Layer:
remapblock
# Just for the PC/XT keyboard
ifset set1
layer 1
#    Restore the Numpad
   PAD_1      PAD_1
   PAD_2      PAD_2
   PAD_3      PAD_3
   PAD_4      PAD_4
   PAD_5      PAD_5
   PAD_6      PAD_6
   PAD_7      PAD_7
   PAD_8      PAD_8
   PAD_9      PAD_9
   PAD_PLUS   PAD_PLUS
   PAD_PERIOD   PAD_PERIOD
   PAD_0      PAD_0

#    add f11 and f12
   F1         F11
   F2         F12

# Volume controls

  F8     MUTE
  F10     VOLUME_UP
  F9    VOLUME_DOWN

#    F keys across the number row
   1         F1
   2         F2
   3         F3
   4         F4
   5         F5
   6         F6
   7         F7
   8         F8
   9         F9
   0         F10
   MINUS      F11
   EQUAL      F12

# Just for the PC/AT keyboard
ifset set2
layer 1
#    Restore the Numpad
  PAD_1      PAD_1
  PAD_2      PAD_2
  PAD_3      PAD_3
  PAD_4      PAD_4
  PAD_5      PAD_5
  PAD_6      PAD_6
  PAD_7      PAD_7
  PAD_8      PAD_8
  PAD_9      PAD_9
  PAD_PLUS   PAD_PLUS
  PAD_PERIOD   PAD_PERIOD
  PAD_0      PAD_0

#    add f11 and f12
  F1         F11
  F2         F12

# Volume controls
 F8     MUTE
 F10     VOLUME_UP
 F9    VOLUME_DOWN

#    F keys across the number row
  1         F1
  2         F2
  3         F3
  4         F4
  5         F5
  6         F6
  7         F7
  8         F8
  9         F9
  0         F10
  MINUS      F11
  EQUAL      F12

endblock
