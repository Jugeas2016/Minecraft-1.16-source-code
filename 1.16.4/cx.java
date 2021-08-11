/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ 
/*     */ public class cx implements BuiltInExceptionProvider {
/*     */   private static final Dynamic2CommandExceptionType a;
/*     */   private static final Dynamic2CommandExceptionType b;
/*     */   private static final Dynamic2CommandExceptionType c;
/*     */   private static final Dynamic2CommandExceptionType d;
/*     */   
/*     */   static {
/*  10 */     a = new Dynamic2CommandExceptionType((☃, object1) -> new of("argument.double.low", new Object[] { object1, ☃ }));
/*  11 */     b = new Dynamic2CommandExceptionType((☃, object1) -> new of("argument.double.big", new Object[] { object1, ☃ }));
/*     */     
/*  13 */     c = new Dynamic2CommandExceptionType((☃, object1) -> new of("argument.float.low", new Object[] { object1, ☃ }));
/*  14 */     d = new Dynamic2CommandExceptionType((☃, object1) -> new of("argument.float.big", new Object[] { object1, ☃ }));
/*     */     
/*  16 */     e = new Dynamic2CommandExceptionType((☃, object1) -> new of("argument.integer.low", new Object[] { object1, ☃ }));
/*  17 */     f = new Dynamic2CommandExceptionType((☃, object1) -> new of("argument.integer.big", new Object[] { object1, ☃ }));
/*     */     
/*  19 */     g = new Dynamic2CommandExceptionType((☃, object1) -> new of("argument.long.low", new Object[] { object1, ☃ }));
/*  20 */     h = new Dynamic2CommandExceptionType((☃, object1) -> new of("argument.long.big", new Object[] { object1, ☃ }));
/*     */     
/*  22 */     i = new DynamicCommandExceptionType(☃ -> new of("argument.literal.incorrect", new Object[] { ☃ }));
/*     */   }
/*  24 */   private static final Dynamic2CommandExceptionType e; private static final Dynamic2CommandExceptionType f; private static final Dynamic2CommandExceptionType g; private static final Dynamic2CommandExceptionType h; private static final DynamicCommandExceptionType i; private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(new of("parsing.quote.expected.start"));
/*  25 */   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(new of("parsing.quote.expected.end")); private static final DynamicCommandExceptionType l; private static final DynamicCommandExceptionType m; private static final DynamicCommandExceptionType n; static {
/*  26 */     l = new DynamicCommandExceptionType(☃ -> new of("parsing.quote.escape", new Object[] { ☃ }));
/*  27 */     m = new DynamicCommandExceptionType(☃ -> new of("parsing.bool.invalid", new Object[] { ☃ }));
/*  28 */     n = new DynamicCommandExceptionType(☃ -> new of("parsing.int.invalid", new Object[] { ☃ }));
/*  29 */   } private static final SimpleCommandExceptionType o = new SimpleCommandExceptionType(new of("parsing.int.expected")); private static final DynamicCommandExceptionType p; static {
/*  30 */     p = new DynamicCommandExceptionType(☃ -> new of("parsing.long.invalid", new Object[] { ☃ }));
/*  31 */   } private static final SimpleCommandExceptionType q = new SimpleCommandExceptionType(new of("parsing.long.expected")); private static final DynamicCommandExceptionType r; static {
/*  32 */     r = new DynamicCommandExceptionType(☃ -> new of("parsing.double.invalid", new Object[] { ☃ }));
/*  33 */   } private static final SimpleCommandExceptionType s = new SimpleCommandExceptionType(new of("parsing.double.expected")); private static final DynamicCommandExceptionType t; static {
/*  34 */     t = new DynamicCommandExceptionType(☃ -> new of("parsing.float.invalid", new Object[] { ☃ }));
/*  35 */   } private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType(new of("parsing.float.expected"));
/*  36 */   private static final SimpleCommandExceptionType v = new SimpleCommandExceptionType(new of("parsing.bool.expected")); private static final DynamicCommandExceptionType w; static {
/*  37 */     w = new DynamicCommandExceptionType(☃ -> new of("parsing.expected", new Object[] { ☃ }));
/*     */   }
/*  39 */   private static final SimpleCommandExceptionType x = new SimpleCommandExceptionType(new of("command.unknown.command"));
/*  40 */   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(new of("command.unknown.argument"));
/*  41 */   private static final SimpleCommandExceptionType z = new SimpleCommandExceptionType(new of("command.expected.separator")); private static final DynamicCommandExceptionType A; static {
/*  42 */     A = new DynamicCommandExceptionType(☃ -> new of("command.exception", new Object[] { ☃ }));
/*     */   }
/*     */   
/*     */   public Dynamic2CommandExceptionType doubleTooLow() {
/*  46 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dynamic2CommandExceptionType doubleTooHigh() {
/*  51 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dynamic2CommandExceptionType floatTooLow() {
/*  56 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dynamic2CommandExceptionType floatTooHigh() {
/*  61 */     return d;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dynamic2CommandExceptionType integerTooLow() {
/*  66 */     return e;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dynamic2CommandExceptionType integerTooHigh() {
/*  71 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dynamic2CommandExceptionType longTooLow() {
/*  76 */     return g;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dynamic2CommandExceptionType longTooHigh() {
/*  81 */     return h;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType literalIncorrect() {
/*  86 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedStartOfQuote() {
/*  91 */     return j;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedEndOfQuote() {
/*  96 */     return k;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerInvalidEscape() {
/* 101 */     return l;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerInvalidBool() {
/* 106 */     return m;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerInvalidInt() {
/* 111 */     return n;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedInt() {
/* 116 */     return o;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerInvalidLong() {
/* 121 */     return p;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedLong() {
/* 126 */     return q;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerInvalidDouble() {
/* 131 */     return r;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedDouble() {
/* 136 */     return s;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerInvalidFloat() {
/* 141 */     return t;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedFloat() {
/* 146 */     return u;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType readerExpectedBool() {
/* 151 */     return v;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType readerExpectedSymbol() {
/* 156 */     return w;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType dispatcherUnknownCommand() {
/* 161 */     return x;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType dispatcherUnknownArgument() {
/* 166 */     return y;
/*     */   }
/*     */ 
/*     */   
/*     */   public SimpleCommandExceptionType dispatcherExpectedArgumentSeparator() {
/* 171 */     return z;
/*     */   }
/*     */ 
/*     */   
/*     */   public DynamicCommandExceptionType dispatcherParseException() {
/* 176 */     return A;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */