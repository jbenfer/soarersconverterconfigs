### Model F 122 key terminal board
ifset set3
layerblock
   fn1     1
   fn2     2
endblock

# Base layer remaps time
# need to map the FN key into the base layer (0)
remapblock
# for Model F 122 key board
ifset set3
layer 0
   CAPS_LOCK  LCTRL

   EXTRA_F1   F1
   EXTRA_F2  F2
   EXTRA_F3  F3
   EXTRA_F4  F4
   EXTRA_F5  F5
   EXTRA_F6  F6
   EXTRA_F7  F7
   EXTRA_F8  F8
   EXTRA_F9  F9
   EXTRA_F10  F10

   EUROPE_1  BACKSLASH

   LANG_4    DOWN

   ESC           NUM_LOCK
   NUM_LOCK     PAD_SLASH
   SCROLL_LOCK   PAD_ASTERIX
   EXTRA_SYSRQ   PAD_MINUS
   PAD_ASTERIX   PAD_PLUS
   PAD_PLUS      PAD_ENTER

   F13   ESC
   F14   MUTE
   F15   VOLUME_DOWN
   F16   VOLUME_UP

   F22   PRINTSCREEN
   F23   SCROLL_LOCK
   F24   PAUSE
endblock

