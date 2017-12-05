###            XT
###            For the original IBM PC/XT Model F

ifset set1
layerblock
   fn1       1
   fn2       2
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

#    Hijack the f-keys for media controls
   F1          F13               # Brightness
   F2          F14
   F3          MEDIA_VOLUME_DOWN   # Volume
   F4          MEDIA_VOLUME_UP
   F5         F10               # MEDIA_PREV_TRACK   # Playback
   F6         F9               # MEDIA_NEXT_TRACK
   F7          F11               # Exposé
   F8          F12
endblock


# Primary Function Layer: HHKB + ESDF Arrows
# the layer itself is just some remaps tagged with the layer number
remapblock
# Just for the PC/XT keyboard
ifset set1
layer 1
#    HHKB Arrows
   LEFT_BRACE    UP
   SEMICOLON    LEFT
   SLASH       DOWN
   QUOTE       RIGHT
   L          PAGE_UP
   PERIOD       PAGE_DOWN
   K          HOME
   COMMA       END
   H          PAD_ASTERIX
   J          PAD_SLASH
   N         PAD_PLUS
   M         PAD_MINUS

#    ESDF Arrows
   E         UP
   S         LEFT
   D         DOWN
   F         RIGHT
   R         PAGE_UP
   V         PAGE_DOWN
   A         HOME
   G         END

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

#    Restore the Function Keys
   F1         F1
   F2         F2
   F3         F3
   F4         F4
   F5         F5
   F6         F6
   F7         F7
   F8         F8
   F9         F9
   F10         F10

#    Media keys across the number row
   1         F13               # Decrease Display Brightness
   2         F14               # Increase Display Brightness
   3         F10               # Exposé: All App Windows
   4         F12               # Dashboard
   5         F11               # Exposé: Show Desktop
   6         F9               # Exposé: All Windows in All Apps
   7         MEDIA_PREV_TRACK   # iTunes / media playback controls
   8         MEDIA_PLAY_PAUSE
   9         MEDIA_NEXT_TRACK
   0         MEDIA_MUTE         # Volume controls
   MINUS      MEDIA_VOLUME_DOWN
   EQUAL      MEDIA_VOLUME_UP
   BACKSPACE   DELETE            # Delete for Backspace
   LCTRL      CAPS_LOCK         # Capslock lives, out of harm's way
   ENTER      PAD_ENTER         # Enter for Return
   ESC         EUROPE_2         # This § symbol
   BACK_QUOTE   EUROPE_2         # In both places I might look for it
endblock


# Secondry Function Layer: Live mods with number row function row
ifset set1
remapblock
layer 2
#    Live Mod Function Row         # Leave those mods alone
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


# Let the going get weird
# Match the PC/XT's unusual legends
# Just for the PC/XT keyboard
ifset set1
macroblock

   # Shift 2 = "
   macro 2 shift -ctrl -alt -gui
   press QUOTE
   endmacro

   # Shift ' = @
   macro QUOTE shift -ctrl -alt -gui
   push_meta set_meta lshift
   press 2
   pop_meta
   endmacro

   # Shift 3 = £
   macro 3 shift -alt
   push_meta set_meta ralt
   push_meta clear_meta shift
   press 3
   pop_meta
   pop_meta
   endmacro

   # Option 3 = #
   macro 3 alt -shift
   push_meta set_meta rshift
   push_meta clear_meta alt
   press 3
   pop_meta
   pop_meta
   endmacro

   # Shift Option + # = ±
   # Corresponding with § remap, this time with shift
   macro BACK_QUOTE shift alt -gui -ctrl
   push_meta set_meta rshift
   press EUROPE_2
   pop_meta
   endmacro

   # ` = #
   macro BACK_QUOTE -all
   push_meta set_meta rshift
   press 3
   pop_meta
   endmacro

   # Command + Escape = Command + Section break (for app window cycling)
   macro ESC gui -ctrl -shift
   press EUROPE_2
   endmacro

#   Swapped over to using USB TKL friendly F13 for inverse colours
#   # Num Lock = Ctrl + Cmd + Opt + 8 (Negative / night colours mode)
#   macro num_lock -shift
#   push_meta set_meta rgui ralt rctrl
#   press 8
#   pop_meta
#   endmacro

#   Ditto. Now using native Shift + F13   for Isolator, too.
#   # Shift + Num Lock = Ctrl + Cmd + Opt + I (Isolator darkness mode)
#   macro num_lock shift
#   push_meta set_meta rgui ralt rctrl
#   push_meta clear_meta lshift rshift
#   press I
#   pop_meta
#   pop_meta
#   endmacro

   # Soarer's Double Shift Caps Lock
   macro lshift rshift
   press caps_lock
   endmacro

   macro rshift lshift
   press caps_lock
   endmacro

   # Quick Ctrl+F-keys for menu navigation
    # Ctrl 2 = Ctrl + F2 = Enter main app menu
    macro 2 ctrl -alt -gui -shift
    press f2
    endmacro

    # Ctrl 8 = Ctrl + F8 = Enter system menus
   macro 8 ctrl -alt -gui -shift
    press f8
    endmacro

    # Invert Colour mode for Shift F13 negative trigger
    macro NUM_LOCK -shift
    push_meta set_meta rshift
    press f13
    pop_meta
    endmacro

    # Isolator mode for Shift F13 negative trigger
    macro NUM_LOCK shift
    press f14
    pop_meta
    endmacro

endblock
