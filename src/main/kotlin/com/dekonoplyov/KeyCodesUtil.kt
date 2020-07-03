package com.dekonoplyov

import java.awt.event.KeyEvent

// Copy of sun.awt.ExtendedKeyCodes
// this version don't prefer Upper Case
fun getExtendedKeyCodeForChar(c: Int): Int {
    if (REGULAR_KEY_CODES_MAP.containsKey(c)) {
        return REGULAR_KEY_CODES_MAP[c]!!
    }
    val unicode = c + 0x01000000
    if (EXTENDED_KEY_CODE_SET.contains(unicode)) {
        return unicode
    }
    return KeyEvent.VK_UNDEFINED
}

private val REGULAR_KEY_CODES_MAP = mapOf(
        0x08 to KeyEvent.VK_BACK_SPACE,
        0x09 to KeyEvent.VK_TAB,
        0x0a to KeyEvent.VK_ENTER,
        0x1B to KeyEvent.VK_ESCAPE,
        0x20AC to KeyEvent.VK_EURO_SIGN,
        0x20 to KeyEvent.VK_SPACE,
        0x21 to KeyEvent.VK_EXCLAMATION_MARK,
        0x22 to KeyEvent.VK_QUOTEDBL,
        0x23 to KeyEvent.VK_NUMBER_SIGN,
        0x24 to KeyEvent.VK_DOLLAR,
        0x26 to KeyEvent.VK_AMPERSAND,
        0x27 to KeyEvent.VK_QUOTE,
        0x28 to KeyEvent.VK_LEFT_PARENTHESIS,
        0x29 to KeyEvent.VK_RIGHT_PARENTHESIS,
        0x2A to KeyEvent.VK_ASTERISK,
        0x2B to KeyEvent.VK_PLUS,
        0x2C to KeyEvent.VK_COMMA,
        0x2D to KeyEvent.VK_MINUS,
        0x2E to KeyEvent.VK_PERIOD,
        0x2F to KeyEvent.VK_SLASH,
        0x30 to KeyEvent.VK_0,
        0x31 to KeyEvent.VK_1,
        0x32 to KeyEvent.VK_2,
        0x33 to KeyEvent.VK_3,
        0x34 to KeyEvent.VK_4,
        0x35 to KeyEvent.VK_5,
        0x36 to KeyEvent.VK_6,
        0x37 to KeyEvent.VK_7,
        0x38 to KeyEvent.VK_8,
        0x39 to KeyEvent.VK_9,
        0x3A to KeyEvent.VK_COLON,
        0x3B to KeyEvent.VK_SEMICOLON,
        0x3C to KeyEvent.VK_LESS,
        0x3D to KeyEvent.VK_EQUALS,
        0x3E to KeyEvent.VK_GREATER,
        0x40 to KeyEvent.VK_AT,
        0x41 to KeyEvent.VK_A,
        0x42 to KeyEvent.VK_B,
        0x43 to KeyEvent.VK_C,
        0x44 to KeyEvent.VK_D,
        0x45 to KeyEvent.VK_E,
        0x46 to KeyEvent.VK_F,
        0x47 to KeyEvent.VK_G,
        0x48 to KeyEvent.VK_H,
        0x49 to KeyEvent.VK_I,
        0x4A to KeyEvent.VK_J,
        0x4B to KeyEvent.VK_K,
        0x4C to KeyEvent.VK_L,
        0x4D to KeyEvent.VK_M,
        0x4E to KeyEvent.VK_N,
        0x4F to KeyEvent.VK_O,
        0x50 to KeyEvent.VK_P,
        0x51 to KeyEvent.VK_Q,
        0x52 to KeyEvent.VK_R,
        0x53 to KeyEvent.VK_S,
        0x54 to KeyEvent.VK_T,
        0x55 to KeyEvent.VK_U,
        0x56 to KeyEvent.VK_V,
        0x57 to KeyEvent.VK_W,
        0x58 to KeyEvent.VK_X,
        0x59 to KeyEvent.VK_Y,
        0x5A to KeyEvent.VK_Z,
        0x5B to KeyEvent.VK_OPEN_BRACKET,
        0x5C to KeyEvent.VK_BACK_SLASH,
        0x5D to KeyEvent.VK_CLOSE_BRACKET,
        0x5E to KeyEvent.VK_CIRCUMFLEX,
        0x5F to KeyEvent.VK_UNDERSCORE,
        0x60 to KeyEvent.VK_BACK_QUOTE,
        0x61 to KeyEvent.VK_A,
        0x62 to KeyEvent.VK_B,
        0x63 to KeyEvent.VK_C,
        0x64 to KeyEvent.VK_D,
        0x65 to KeyEvent.VK_E,
        0x66 to KeyEvent.VK_F,
        0x67 to KeyEvent.VK_G,
        0x68 to KeyEvent.VK_H,
        0x69 to KeyEvent.VK_I,
        0x6A to KeyEvent.VK_J,
        0x6B to KeyEvent.VK_K,
        0x6C to KeyEvent.VK_L,
        0x6D to KeyEvent.VK_M,
        0x6E to KeyEvent.VK_N,
        0x6F to KeyEvent.VK_O,
        0x70 to KeyEvent.VK_P,
        0x71 to KeyEvent.VK_Q,
        0x72 to KeyEvent.VK_R,
        0x73 to KeyEvent.VK_S,
        0x74 to KeyEvent.VK_T,
        0x75 to KeyEvent.VK_U,
        0x76 to KeyEvent.VK_V,
        0x77 to KeyEvent.VK_W,
        0x78 to KeyEvent.VK_X,
        0x79 to KeyEvent.VK_Y,
        0x7A to KeyEvent.VK_Z,
        0x7B to KeyEvent.VK_BRACELEFT,
        0x7D to KeyEvent.VK_BRACERIGHT,
        0x7F to KeyEvent.VK_DELETE,
        0xA1 to KeyEvent.VK_INVERTED_EXCLAMATION_MARK,
        0xF701 to KeyEvent.VK_DOWN, // NSDownArrowFunctionKey
        0xF702 to KeyEvent.VK_LEFT, // NSLeftArrowFunctionKey
        0xF703 to KeyEvent.VK_RIGHT, // NSRightArrowFunctionKey
        0xF704 to KeyEvent.VK_F1, // NSF1FunctionKey
        0xF705 to KeyEvent.VK_F2, // NSF2FunctionKey
        0xF706 to KeyEvent.VK_F3, // NSF3FunctionKey
        0xF707 to KeyEvent.VK_F4, // NSF4FunctionKey
        0xF708 to KeyEvent.VK_F5, // NSF5FunctionKey
        0xF709 to KeyEvent.VK_F6, // NSF6FunctionKey
        0xF70A to KeyEvent.VK_F7, // NSF7FunctionKey
        0xF70B to KeyEvent.VK_F8, // NSF8FunctionKey
        0xF70C to KeyEvent.VK_F9, // NSF9FunctionKey
        0xF70D to KeyEvent.VK_F10, // NSF10FunctionKey
        0xF70E to KeyEvent.VK_F11, // NSF11FunctionKey
        0xF70F to KeyEvent.VK_F12, // NSF12FunctionKey
        0xF710 to KeyEvent.VK_F13, // NSF13FunctionKey
        0xF711 to KeyEvent.VK_F14, // NSF14FunctionKey
        0xF712 to KeyEvent.VK_F15, // NSF15FunctionKey
        0xF713 to KeyEvent.VK_F16, // NSF16FunctionKey
        0xF714 to KeyEvent.VK_F17, // NSF17FunctionKey
        0xF715 to KeyEvent.VK_F18, // NSF18FunctionKey
        0xF716 to KeyEvent.VK_F19, // NSF19FunctionKey
        0xF717 to KeyEvent.VK_F20, // NSF20FunctionKey
        0xF718 to KeyEvent.VK_F21, // NSF21FunctionKey
        0xF719 to KeyEvent.VK_F22, // NSF22FunctionKey
        0xF71A to KeyEvent.VK_F23, // NSF23FunctionKey
        0xF71B to KeyEvent.VK_F24, // NSF24FunctionKey
        0xF727 to KeyEvent.VK_INSERT, // NSInsertFunctionKey
        0xF728 to KeyEvent.VK_DELETE, // NSDeleteFunctionKey
        0xF729 to KeyEvent.VK_HOME, // NSHomeFunctionKey
        0xF72A to KeyEvent.VK_BEGIN, // NSBeginFunctionKey
        0xF72B to KeyEvent.VK_END, // NSEndFunctionKey
        0xF72C to KeyEvent.VK_PAGE_UP, // NSPageUpFunctionKey
        0xF72D to KeyEvent.VK_PAGE_DOWN, // NSPageDownFunctionKey
        0xF72E to KeyEvent.VK_PRINTSCREEN, // NSPrintScreenFunctionKey
        0xF72F to KeyEvent.VK_SCROLL_LOCK, // NSScrollLockFunctionKey
        0xF730 to KeyEvent.VK_PAUSE, // NSPauseFunctionKey
        0xF734 to KeyEvent.VK_STOP, // NSStopFunctionKey
        0xF735 to KeyEvent.VK_CONTEXT_MENU, // NSMenuFunctionKey
        0xF738 to KeyEvent.VK_PRINTSCREEN, // NSPrintFunctionKey
        0xF739 to KeyEvent.VK_CLEAR, // NSClearLineFunctionKey
        0xF746 to KeyEvent.VK_HELP) // NSHelpFunctionKey

private val EXTENDED_KEY_CODE_SET = setOf(
        0x01000000 + 0x0060,
        0x01000000 + 0x007C,
        0x01000000 + 0x007E,
        0x01000000 + 0x00A2,
        0x01000000 + 0x00A3,
        0x01000000 + 0x00A5,
        0x01000000 + 0x00A7,
        0x01000000 + 0x00A8,
        0x01000000 + 0x00AB,
        0x01000000 + 0x00B0,
        0x01000000 + 0x00B1,
        0x01000000 + 0x00B2,
        0x01000000 + 0x00B3,
        0x01000000 + 0x00B4,
        0x01000000 + 0x00B5,
        0x01000000 + 0x00B6,
        0x01000000 + 0x00B7,
        0x01000000 + 0x00B9,
        0x01000000 + 0x00BA,
        0x01000000 + 0x00BB,
        0x01000000 + 0x00BC,
        0x01000000 + 0x00BD,
        0x01000000 + 0x00BE,
        0x01000000 + 0x00BF,
        0x01000000 + 0x00C4,
        0x01000000 + 0x00C5,
        0x01000000 + 0x00C6,
        0x01000000 + 0x00C7,
        0x01000000 + 0x00D1,
        0x01000000 + 0x00D6,
        0x01000000 + 0x00D7,
        0x01000000 + 0x00D8,
        0x01000000 + 0x00DF,
        0x01000000 + 0x00E0,
        0x01000000 + 0x00E1,
        0x01000000 + 0x00E2,
        0x01000000 + 0x00E4,
        0x01000000 + 0x00E5,
        0x01000000 + 0x00E6,
        0x01000000 + 0x00E7,
        0x01000000 + 0x00E8,
        0x01000000 + 0x00E9,
        0x01000000 + 0x00EA,
        0x01000000 + 0x00EB,
        0x01000000 + 0x00EC,
        0x01000000 + 0x00ED,
        0x01000000 + 0x00EE,
        0x01000000 + 0x00F0,
        0x01000000 + 0x00F1,
        0x01000000 + 0x00F2,
        0x01000000 + 0x00F3,
        0x01000000 + 0x00F4,
        0x01000000 + 0x00F5,
        0x01000000 + 0x00F6,
        0x01000000 + 0x00F7,
        0x01000000 + 0x00F8,
        0x01000000 + 0x00F9,
        0x01000000 + 0x00FA,
        0x01000000 + 0x00FB,
        0x01000000 + 0x00FC,
        0x01000000 + 0x00FD,
        0x01000000 + 0x00FE,
        0x01000000 + 0x0105,
        0x01000000 + 0x02DB,
        0x01000000 + 0x0142,
        0x01000000 + 0x013E,
        0x01000000 + 0x015B,
        0x01000000 + 0x0161,
        0x01000000 + 0x015F,
        0x01000000 + 0x0165,
        0x01000000 + 0x017E,
        0x01000000 + 0x017C,
        0x01000000 + 0x0103,
        0x01000000 + 0x0107,
        0x01000000 + 0x010D,
        0x01000000 + 0x0119,
        0x01000000 + 0x011B,
        0x01000000 + 0x0111,
        0x01000000 + 0x0148,
        0x01000000 + 0x0151,
        0x01000000 + 0x0171,
        0x01000000 + 0x0159,
        0x01000000 + 0x016F,
        0x01000000 + 0x0163,
        0x01000000 + 0x02D9,
        0x01000000 + 0x0130,
        0x01000000 + 0x0127,
        0x01000000 + 0x0125,
        0x01000000 + 0x0131,
        0x01000000 + 0x011F,
        0x01000000 + 0x0135,
        0x01000000 + 0x010B,
        0x01000000 + 0x0109,
        0x01000000 + 0x0121,
        0x01000000 + 0x011D,
        0x01000000 + 0x016D,
        0x01000000 + 0x015D,
        0x01000000 + 0x0138,
        0x01000000 + 0x0157,
        0x01000000 + 0x013C,
        0x01000000 + 0x0113,
        0x01000000 + 0x0123,
        0x01000000 + 0x0167,
        0x01000000 + 0x014B,
        0x01000000 + 0x0101,
        0x01000000 + 0x012F,
        0x01000000 + 0x0117,
        0x01000000 + 0x012B,
        0x01000000 + 0x0146,
        0x01000000 + 0x014D,
        0x01000000 + 0x0137,
        0x01000000 + 0x0173,
        0x01000000 + 0x016B,
        0x01000000 + 0x0153,
        0x01000000 + 0x30FC,
        0x01000000 + 0x30A2,
        0x01000000 + 0x30A4,
        0x01000000 + 0x30A6,
        0x01000000 + 0x30A8,
        0x01000000 + 0x30AA,
        0x01000000 + 0x30AB,
        0x01000000 + 0x30AD,
        0x01000000 + 0x30AF,
        0x01000000 + 0x30B1,
        0x01000000 + 0x30B3,
        0x01000000 + 0x30B5,
        0x01000000 + 0x30B7,
        0x01000000 + 0x30B9,
        0x01000000 + 0x30BB,
        0x01000000 + 0x30BD,
        0x01000000 + 0x30BF,
        0x01000000 + 0x30C1,
        0x01000000 + 0x30C4,
        0x01000000 + 0x30C6,
        0x01000000 + 0x30C8,
        0x01000000 + 0x30CA,
        0x01000000 + 0x30CB,
        0x01000000 + 0x30CC,
        0x01000000 + 0x30CD,
        0x01000000 + 0x30CE,
        0x01000000 + 0x30CF,
        0x01000000 + 0x30D2,
        0x01000000 + 0x30D5,
        0x01000000 + 0x30D8,
        0x01000000 + 0x30DB,
        0x01000000 + 0x30DE,
        0x01000000 + 0x30DF,
        0x01000000 + 0x30E0,
        0x01000000 + 0x30E1,
        0x01000000 + 0x30E2,
        0x01000000 + 0x30E4,
        0x01000000 + 0x30E6,
        0x01000000 + 0x30E8,
        0x01000000 + 0x30E9,
        0x01000000 + 0x30EA,
        0x01000000 + 0x30EB,
        0x01000000 + 0x30EC,
        0x01000000 + 0x30ED,
        0x01000000 + 0x30EF,
        0x01000000 + 0x30F3,
        0x01000000 + 0x309B,
        0x01000000 + 0x309C,
        0x01000000 + 0x06F0,
        0x01000000 + 0x06F1,
        0x01000000 + 0x06F2,
        0x01000000 + 0x06F3,
        0x01000000 + 0x06F4,
        0x01000000 + 0x06F5,
        0x01000000 + 0x06F6,
        0x01000000 + 0x06F7,
        0x01000000 + 0x06F8,
        0x01000000 + 0x06F9,
        0x01000000 + 0x0670,
        0x01000000 + 0x067E,
        0x01000000 + 0x0686,
        0x01000000 + 0x060C,
        0x01000000 + 0x06D4,
        0x01000000 + 0x0660,
        0x01000000 + 0x0661,
        0x01000000 + 0x0662,
        0x01000000 + 0x0663,
        0x01000000 + 0x0664,
        0x01000000 + 0x0665,
        0x01000000 + 0x0666,
        0x01000000 + 0x0667,
        0x01000000 + 0x0668,
        0x01000000 + 0x0669,
        0x01000000 + 0x061B,
        0x01000000 + 0x0621,
        0x01000000 + 0x0624,
        0x01000000 + 0x0626,
        0x01000000 + 0x0627,
        0x01000000 + 0x0628,
        0x01000000 + 0x0629,
        0x01000000 + 0x062A,
        0x01000000 + 0x062B,
        0x01000000 + 0x062C,
        0x01000000 + 0x062D,
        0x01000000 + 0x062E,
        0x01000000 + 0x062F,
        0x01000000 + 0x0630,
        0x01000000 + 0x0631,
        0x01000000 + 0x0632,
        0x01000000 + 0x0633,
        0x01000000 + 0x0634,
        0x01000000 + 0x0635,
        0x01000000 + 0x0636,
        0x01000000 + 0x0637,
        0x01000000 + 0x0638,
        0x01000000 + 0x0639,
        0x01000000 + 0x063A,
        0x01000000 + 0x0641,
        0x01000000 + 0x0642,
        0x01000000 + 0x0643,
        0x01000000 + 0x0644,
        0x01000000 + 0x0645,
        0x01000000 + 0x0646,
        0x01000000 + 0x0647,
        0x01000000 + 0x0648,
        0x01000000 + 0x0649,
        0x01000000 + 0x064A,
        0x01000000 + 0x064E,
        0x01000000 + 0x064F,
        0x01000000 + 0x0650,
        0x01000000 + 0x0652,
        0x01000000 + 0x0698,
        0x01000000 + 0x06A4,
        0x01000000 + 0x06A9,
        0x01000000 + 0x06AF,
        0x01000000 + 0x06BE,
        0x01000000 + 0x06CC,
        0x01000000 + 0x06CC,
        0x01000000 + 0x06D2,
        0x01000000 + 0x0493,
        0x01000000 + 0x0497,
        0x01000000 + 0x049B,
        0x01000000 + 0x049D,
        0x01000000 + 0x04A3,
        0x01000000 + 0x04AF,
        0x01000000 + 0x04B1,
        0x01000000 + 0x04B3,
        0x01000000 + 0x04B9,
        0x01000000 + 0x04BB,
        0x01000000 + 0x04D9,
        0x01000000 + 0x04E9,
        0x01000000 + 0x0452,
        0x01000000 + 0x0453,
        0x01000000 + 0x0451,
        0x01000000 + 0x0454,
        0x01000000 + 0x0455,
        0x01000000 + 0x0456,
        0x01000000 + 0x0457,
        0x01000000 + 0x0458,
        0x01000000 + 0x0459,
        0x01000000 + 0x045A,
        0x01000000 + 0x045B,
        0x01000000 + 0x045C,
        0x01000000 + 0x0491,
        0x01000000 + 0x045E,
        0x01000000 + 0x045F,
        0x01000000 + 0x2116,
        0x01000000 + 0x044E,
        0x01000000 + 0x0430,
        0x01000000 + 0x0431,
        0x01000000 + 0x0446,
        0x01000000 + 0x0434,
        0x01000000 + 0x0435,
        0x01000000 + 0x0444,
        0x01000000 + 0x0433,
        0x01000000 + 0x0445,
        0x01000000 + 0x0438,
        0x01000000 + 0x0439,
        0x01000000 + 0x043A,
        0x01000000 + 0x043B,
        0x01000000 + 0x043C,
        0x01000000 + 0x043D,
        0x01000000 + 0x043E,
        0x01000000 + 0x043F,
        0x01000000 + 0x044F,
        0x01000000 + 0x0440,
        0x01000000 + 0x0441,
        0x01000000 + 0x0442,
        0x01000000 + 0x0443,
        0x01000000 + 0x0436,
        0x01000000 + 0x0432,
        0x01000000 + 0x044C,
        0x01000000 + 0x044B,
        0x01000000 + 0x0437,
        0x01000000 + 0x0448,
        0x01000000 + 0x044D,
        0x01000000 + 0x0449,
        0x01000000 + 0x0447,
        0x01000000 + 0x044A,
        0x01000000 + 0x2015,
        0x01000000 + 0x03B1,
        0x01000000 + 0x03B2,
        0x01000000 + 0x03B3,
        0x01000000 + 0x03B4,
        0x01000000 + 0x03B5,
        0x01000000 + 0x03B6,
        0x01000000 + 0x03B7,
        0x01000000 + 0x03B8,
        0x01000000 + 0x03B9,
        0x01000000 + 0x03BA,
        0x01000000 + 0x03BB,
        0x01000000 + 0x03BC,
        0x01000000 + 0x03BD,
        0x01000000 + 0x03BE,
        0x01000000 + 0x03BF,
        0x01000000 + 0x03C0,
        0x01000000 + 0x03C1,
        0x01000000 + 0x03C3,
        0x01000000 + 0x03C2,
        0x01000000 + 0x03C4,
        0x01000000 + 0x03C5,
        0x01000000 + 0x03C6,
        0x01000000 + 0x03C7,
        0x01000000 + 0x03C8,
        0x01000000 + 0x03C9,
        0x01000000 + 0x2190,
        0x01000000 + 0x2192,
        0x01000000 + 0x2193,
        0x01000000 + 0x2013,
        0x01000000 + 0x201C,
        0x01000000 + 0x201D,
        0x01000000 + 0x201E,
        0x01000000 + 0x05D0,
        0x01000000 + 0x05D1,
        0x01000000 + 0x05D2,
        0x01000000 + 0x05D3,
        0x01000000 + 0x05D4,
        0x01000000 + 0x05D5,
        0x01000000 + 0x05D6,
        0x01000000 + 0x05D7,
        0x01000000 + 0x05D8,
        0x01000000 + 0x05D9,
        0x01000000 + 0x05DA,
        0x01000000 + 0x05DB,
        0x01000000 + 0x05DC,
        0x01000000 + 0x05DD,
        0x01000000 + 0x05DE,
        0x01000000 + 0x05DF,
        0x01000000 + 0x05E0,
        0x01000000 + 0x05E1,
        0x01000000 + 0x05E2,
        0x01000000 + 0x05E3,
        0x01000000 + 0x05E4,
        0x01000000 + 0x05E5,
        0x01000000 + 0x05E6,
        0x01000000 + 0x05E7,
        0x01000000 + 0x05E8,
        0x01000000 + 0x05E9,
        0x01000000 + 0x05EA,
        0x01000000 + 0x0E01,
        0x01000000 + 0x0E02,
        0x01000000 + 0x0E03,
        0x01000000 + 0x0E04,
        0x01000000 + 0x0E05,
        0x01000000 + 0x0E07,
        0x01000000 + 0x0E08,
        0x01000000 + 0x0E0A,
        0x01000000 + 0x0E0C,
        0x01000000 + 0x0E14,
        0x01000000 + 0x0E15,
        0x01000000 + 0x0E16,
        0x01000000 + 0x0E17,
        0x01000000 + 0x0E19,
        0x01000000 + 0x0E1A,
        0x01000000 + 0x0E1B,
        0x01000000 + 0x0E1C,
        0x01000000 + 0x0E1D,
        0x01000000 + 0x0E1E,
        0x01000000 + 0x0E1F,
        0x01000000 + 0x0E20,
        0x01000000 + 0x0E21,
        0x01000000 + 0x0E22,
        0x01000000 + 0x0E23,
        0x01000000 + 0x0E25,
        0x01000000 + 0x0E27,
        0x01000000 + 0x0E2A,
        0x01000000 + 0x0E2B,
        0x01000000 + 0x0E2D,
        0x01000000 + 0x0E30,
        0x01000000 + 0x0E31,
        0x01000000 + 0x0E32,
        0x01000000 + 0x0E33,
        0x01000000 + 0x0E34,
        0x01000000 + 0x0E35,
        0x01000000 + 0x0E36,
        0x01000000 + 0x0E37,
        0x01000000 + 0x0E38,
        0x01000000 + 0x0E39,
        0x01000000 + 0x0E3F,
        0x01000000 + 0x0E40,
        0x01000000 + 0x0E41,
        0x01000000 + 0x0E43,
        0x01000000 + 0x0E44,
        0x01000000 + 0x0E45,
        0x01000000 + 0x0E46,
        0x01000000 + 0x0E47,
        0x01000000 + 0x0E48,
        0x01000000 + 0x0E49,
        0x01000000 + 0x0E50,
        0x01000000 + 0x0E51,
        0x01000000 + 0x0E52,
        0x01000000 + 0x0E53,
        0x01000000 + 0x0E54,
        0x01000000 + 0x0E55,
        0x01000000 + 0x0E56,
        0x01000000 + 0x0E57,
        0x01000000 + 0x0E58,
        0x01000000 + 0x0E59,
        0x01000000 + 0x0587,
        0x01000000 + 0x0589,
        0x01000000 + 0x0589,
        0x01000000 + 0x055D,
        0x01000000 + 0x055D,
        0x01000000 + 0x055B,
        0x01000000 + 0x055B,
        0x01000000 + 0x055E,
        0x01000000 + 0x055E,
        0x01000000 + 0x0561,
        0x01000000 + 0x0562,
        0x01000000 + 0x0563,
        0x01000000 + 0x0564,
        0x01000000 + 0x0565,
        0x01000000 + 0x0566,
        0x01000000 + 0x0567,
        0x01000000 + 0x0568,
        0x01000000 + 0x0569,
        0x01000000 + 0x056A,
        0x01000000 + 0x056B,
        0x01000000 + 0x056C,
        0x01000000 + 0x056D,
        0x01000000 + 0x056E,
        0x01000000 + 0x056F,
        0x01000000 + 0x0570,
        0x01000000 + 0x0571,
        0x01000000 + 0x0572,
        0x01000000 + 0x0573,
        0x01000000 + 0x0574,
        0x01000000 + 0x0575,
        0x01000000 + 0x0576,
        0x01000000 + 0x0577,
        0x01000000 + 0x0578,
        0x01000000 + 0x0579,
        0x01000000 + 0x057A,
        0x01000000 + 0x057B,
        0x01000000 + 0x057C,
        0x01000000 + 0x057D,
        0x01000000 + 0x057E,
        0x01000000 + 0x057F,
        0x01000000 + 0x0580,
        0x01000000 + 0x0581,
        0x01000000 + 0x0582,
        0x01000000 + 0x0583,
        0x01000000 + 0x0584,
        0x01000000 + 0x0585,
        0x01000000 + 0x0586,
        0x01000000 + 0x10D0,
        0x01000000 + 0x10D1,
        0x01000000 + 0x10D2,
        0x01000000 + 0x10D3,
        0x01000000 + 0x10D4,
        0x01000000 + 0x10D5,
        0x01000000 + 0x10D6,
        0x01000000 + 0x10D7,
        0x01000000 + 0x10D8,
        0x01000000 + 0x10D9,
        0x01000000 + 0x10DA,
        0x01000000 + 0x10DB,
        0x01000000 + 0x10DC,
        0x01000000 + 0x10DD,
        0x01000000 + 0x10DE,
        0x01000000 + 0x10DF,
        0x01000000 + 0x10E0,
        0x01000000 + 0x10E1,
        0x01000000 + 0x10E2,
        0x01000000 + 0x10E3,
        0x01000000 + 0x10E4,
        0x01000000 + 0x10E5,
        0x01000000 + 0x10E6,
        0x01000000 + 0x10E7,
        0x01000000 + 0x10E8,
        0x01000000 + 0x10E9,
        0x01000000 + 0x10EA,
        0x01000000 + 0x10EB,
        0x01000000 + 0x10EC,
        0x01000000 + 0x10ED,
        0x01000000 + 0x10EE,
        0x01000000 + 0x10EF,
        0x01000000 + 0x10F0,
        0x01000000 + 0x01E7,
        0x01000000 + 0x0259,
        0x01000000 + 0x1EB9,
        0x01000000 + 0x1ECB,
        0x01000000 + 0x1ECD,
        0x01000000 + 0x1EE5,
        0x01000000 + 0x01A1,
        0x01000000 + 0x01B0,
        0x01000000 + 0x20AB)