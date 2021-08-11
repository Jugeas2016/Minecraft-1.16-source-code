/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.List;
/*     */ import java.util.regex.Pattern;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class mu
/*     */ {
/*  16 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("argument.nbt.trailing"));
/*  17 */   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("argument.nbt.expected.key"));
/*  18 */   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new of("argument.nbt.expected.value")); static {
/*  19 */     d = new Dynamic2CommandExceptionType((☃, object1) -> new of("argument.nbt.list.mixed", new Object[] { ☃, object1 }));
/*  20 */     e = new Dynamic2CommandExceptionType((☃, object1) -> new of("argument.nbt.array.mixed", new Object[] { ☃, object1 }));
/*  21 */     f = new DynamicCommandExceptionType(☃ -> new of("argument.nbt.array.invalid", new Object[] { ☃ }));
/*     */   }
/*     */ 
/*     */   
/*     */   public static final Dynamic2CommandExceptionType d;
/*     */   
/*     */   public static final Dynamic2CommandExceptionType e;
/*     */   
/*     */   public static final DynamicCommandExceptionType f;
/*  30 */   private static final Pattern g = Pattern.compile("[-+]?(?:[0-9]+[.]|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?", 2);
/*  31 */   private static final Pattern h = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?d", 2);
/*  32 */   private static final Pattern i = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?f", 2);
/*  33 */   private static final Pattern j = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)b", 2);
/*  34 */   private static final Pattern k = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)l", 2);
/*  35 */   private static final Pattern l = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)s", 2);
/*  36 */   private static final Pattern m = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)");
/*     */   
/*     */   private final StringReader n;
/*     */   
/*     */   public static md a(String ☃) throws CommandSyntaxException {
/*  41 */     return (new mu(new StringReader(☃))).a();
/*     */   }
/*     */   
/*     */   @VisibleForTesting
/*     */   md a() throws CommandSyntaxException {
/*  46 */     md ☃ = f();
/*     */     
/*  48 */     this.n.skipWhitespace();
/*     */     
/*  50 */     if (this.n.canRead()) {
/*  51 */       throw a.createWithContext(this.n);
/*     */     }
/*  53 */     return ☃;
/*     */   }
/*     */   
/*     */   public mu(StringReader ☃) {
/*  57 */     this.n = ☃;
/*     */   }
/*     */   
/*     */   protected String b() throws CommandSyntaxException {
/*  61 */     this.n.skipWhitespace();
/*     */     
/*  63 */     if (!this.n.canRead()) {
/*  64 */       throw b.createWithContext(this.n);
/*     */     }
/*     */     
/*  67 */     return this.n.readString();
/*     */   }
/*     */   
/*     */   protected mt c() throws CommandSyntaxException {
/*  71 */     this.n.skipWhitespace();
/*  72 */     int ☃ = this.n.getCursor();
/*     */     
/*  74 */     if (StringReader.isQuotedStringStart(this.n.peek())) {
/*  75 */       return ms.a(this.n.readQuotedString());
/*     */     }
/*     */     
/*  78 */     String str = this.n.readUnquotedString();
/*  79 */     if (str.isEmpty()) {
/*  80 */       this.n.setCursor(☃);
/*  81 */       throw c.createWithContext(this.n);
/*     */     } 
/*  83 */     return b(str);
/*     */   }
/*     */   
/*     */   private mt b(String ☃) {
/*     */     try {
/*  88 */       if (i.matcher(☃).matches()) {
/*  89 */         return mg.a(Float.parseFloat(☃.substring(0, ☃.length() - 1)));
/*     */       }
/*  91 */       if (j.matcher(☃).matches()) {
/*  92 */         return mb.a(Byte.parseByte(☃.substring(0, ☃.length() - 1)));
/*     */       }
/*  94 */       if (k.matcher(☃).matches()) {
/*  95 */         return ml.a(Long.parseLong(☃.substring(0, ☃.length() - 1)));
/*     */       }
/*  97 */       if (l.matcher(☃).matches()) {
/*  98 */         return mr.a(Short.parseShort(☃.substring(0, ☃.length() - 1)));
/*     */       }
/* 100 */       if (m.matcher(☃).matches()) {
/* 101 */         return mi.a(Integer.parseInt(☃));
/*     */       }
/* 103 */       if (h.matcher(☃).matches()) {
/* 104 */         return me.a(Double.parseDouble(☃.substring(0, ☃.length() - 1)));
/*     */       }
/* 106 */       if (g.matcher(☃).matches()) {
/* 107 */         return me.a(Double.parseDouble(☃));
/*     */       }
/* 109 */       if ("true".equalsIgnoreCase(☃)) {
/* 110 */         return mb.c;
/*     */       }
/* 112 */       if ("false".equalsIgnoreCase(☃)) {
/* 113 */         return mb.b;
/*     */       }
/* 115 */     } catch (NumberFormatException numberFormatException) {}
/*     */ 
/*     */     
/* 118 */     return ms.a(☃);
/*     */   }
/*     */   
/*     */   public mt d() throws CommandSyntaxException {
/* 122 */     this.n.skipWhitespace();
/*     */     
/* 124 */     if (!this.n.canRead()) {
/* 125 */       throw c.createWithContext(this.n);
/*     */     }
/*     */     
/* 128 */     char ☃ = this.n.peek();
/* 129 */     if (☃ == '{')
/* 130 */       return f(); 
/* 131 */     if (☃ == '[') {
/* 132 */       return e();
/*     */     }
/* 134 */     return c();
/*     */   }
/*     */   
/*     */   protected mt e() throws CommandSyntaxException {
/* 138 */     if (this.n.canRead(3) && 
/* 139 */       !StringReader.isQuotedStringStart(this.n.peek(1)) && this.n.peek(2) == ';') {
/* 140 */       return h();
/*     */     }
/*     */     
/* 143 */     return g();
/*     */   }
/*     */   
/*     */   public md f() throws CommandSyntaxException {
/* 147 */     a('{');
/*     */     
/* 149 */     md ☃ = new md();
/*     */     
/* 151 */     this.n.skipWhitespace();
/* 152 */     while (this.n.canRead() && this.n.peek() != '}') {
/* 153 */       int i = this.n.getCursor();
/* 154 */       String str = b();
/* 155 */       if (str.isEmpty()) {
/* 156 */         this.n.setCursor(i);
/* 157 */         throw b.createWithContext(this.n);
/*     */       } 
/*     */       
/* 160 */       a(':');
/*     */       
/* 162 */       ☃.a(str, d());
/*     */       
/* 164 */       if (!i())
/*     */         break; 
/* 166 */       if (!this.n.canRead()) {
/* 167 */         throw b.createWithContext(this.n);
/*     */       }
/*     */     } 
/* 170 */     a('}');
/*     */     
/* 172 */     return ☃;
/*     */   }
/*     */   
/*     */   private mt g() throws CommandSyntaxException {
/* 176 */     a('[');
/*     */     
/* 178 */     this.n.skipWhitespace();
/*     */     
/* 180 */     if (!this.n.canRead()) {
/* 181 */       throw c.createWithContext(this.n);
/*     */     }
/*     */     
/* 184 */     mj ☃ = new mj();
/*     */     
/* 186 */     mv<?> mv = null;
/* 187 */     while (this.n.peek() != ']') {
/* 188 */       int i = this.n.getCursor();
/* 189 */       mt mt = d();
/*     */       
/* 191 */       mv<?> mv1 = mt.b();
/* 192 */       if (mv == null) {
/* 193 */         mv = mv1;
/* 194 */       } else if (mv1 != mv) {
/* 195 */         this.n.setCursor(i);
/* 196 */         throw d.createWithContext(this.n, mv1.b(), mv.b());
/*     */       } 
/*     */       
/* 199 */       ☃.add(mt);
/*     */       
/* 201 */       if (!i())
/*     */         break; 
/* 203 */       if (!this.n.canRead()) {
/* 204 */         throw c.createWithContext(this.n);
/*     */       }
/*     */     } 
/* 207 */     a(']');
/*     */     
/* 209 */     return ☃;
/*     */   }
/*     */   
/*     */   private mt h() throws CommandSyntaxException {
/* 213 */     a('[');
/* 214 */     int ☃ = this.n.getCursor();
/* 215 */     char c = this.n.read();
/* 216 */     this.n.read();
/*     */     
/* 218 */     this.n.skipWhitespace();
/*     */     
/* 220 */     if (!this.n.canRead()) {
/* 221 */       throw c.createWithContext(this.n);
/*     */     }
/*     */     
/* 224 */     if (c == 'B')
/* 225 */       return new ma(a(ma.a, mb.a)); 
/* 226 */     if (c == 'L')
/* 227 */       return new mk(a(mk.a, ml.a)); 
/* 228 */     if (c == 'I') {
/* 229 */       return new mh(a(mh.a, mi.a));
/*     */     }
/* 231 */     this.n.setCursor(☃);
/* 232 */     throw f.createWithContext(this.n, String.valueOf(c));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private <T extends Number> List<T> a(mv<?> ☃, mv<?> mv1) throws CommandSyntaxException {
/* 238 */     List<T> list = Lists.newArrayList();
/*     */     
/* 240 */     while (this.n.peek() != ']') {
/* 241 */       int i = this.n.getCursor();
/* 242 */       mt mt = d();
/*     */       
/* 244 */       mv<?> mv2 = mt.b();
/* 245 */       if (mv2 != mv1) {
/* 246 */         this.n.setCursor(i);
/* 247 */         throw e.createWithContext(this.n, mv2.b(), ☃.b());
/*     */       } 
/*     */       
/* 250 */       if (mv1 == mb.a) {
/* 251 */         list.add((T)Byte.valueOf(((mq)mt).h()));
/* 252 */       } else if (mv1 == ml.a) {
/* 253 */         list.add((T)Long.valueOf(((mq)mt).e()));
/*     */       } else {
/* 255 */         list.add((T)Integer.valueOf(((mq)mt).f()));
/*     */       } 
/*     */       
/* 258 */       if (!i())
/*     */         break; 
/* 260 */       if (!this.n.canRead()) {
/* 261 */         throw c.createWithContext(this.n);
/*     */       }
/*     */     } 
/* 264 */     a(']');
/*     */     
/* 266 */     return list;
/*     */   }
/*     */   
/*     */   private boolean i() {
/* 270 */     this.n.skipWhitespace();
/* 271 */     if (this.n.canRead() && this.n.peek() == ',') {
/* 272 */       this.n.skip();
/* 273 */       this.n.skipWhitespace();
/* 274 */       return true;
/*     */     } 
/* 276 */     return false;
/*     */   }
/*     */   
/*     */   private void a(char ☃) throws CommandSyntaxException {
/* 280 */     this.n.skipWhitespace();
/*     */     
/* 282 */     this.n.expect(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\mu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */