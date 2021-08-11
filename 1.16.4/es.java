/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class es
/*     */ {
/*  11 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("argument.pos.missing.double"));
/*  12 */   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("argument.pos.missing.int"));
/*     */   
/*     */   private final boolean c;
/*     */   private final double d;
/*     */   
/*     */   public es(boolean ☃, double d) {
/*  18 */     this.c = ☃;
/*  19 */     this.d = d;
/*     */   }
/*     */   
/*     */   public double a(double ☃) {
/*  23 */     if (this.c) {
/*  24 */       return this.d + ☃;
/*     */     }
/*  26 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public static es a(StringReader ☃, boolean bool) throws CommandSyntaxException {
/*  31 */     if (☃.canRead() && ☃.peek() == '^') {
/*  32 */       throw er.b.createWithContext(☃);
/*     */     }
/*     */     
/*  35 */     if (!☃.canRead()) {
/*  36 */       throw a.createWithContext(☃);
/*     */     }
/*     */     
/*  39 */     boolean bool1 = b(☃);
/*  40 */     int i = ☃.getCursor();
/*  41 */     double d = (☃.canRead() && ☃.peek() != ' ') ? ☃.readDouble() : 0.0D;
/*  42 */     String str = ☃.getString().substring(i, ☃.getCursor());
/*     */     
/*  44 */     if (bool1 && str.isEmpty()) {
/*  45 */       return new es(true, 0.0D);
/*     */     }
/*     */     
/*  48 */     if (!str.contains(".") && !bool1 && bool) {
/*  49 */       d += 0.5D;
/*     */     }
/*     */     
/*  52 */     return new es(bool1, d);
/*     */   }
/*     */   public static es a(StringReader ☃) throws CommandSyntaxException {
/*     */     double d;
/*  56 */     if (☃.canRead() && ☃.peek() == '^') {
/*  57 */       throw er.b.createWithContext(☃);
/*     */     }
/*     */     
/*  60 */     if (!☃.canRead()) {
/*  61 */       throw b.createWithContext(☃);
/*     */     }
/*     */     
/*  64 */     boolean bool = b(☃);
/*     */     
/*  66 */     if (☃.canRead() && ☃.peek() != ' ') {
/*  67 */       d = bool ? ☃.readDouble() : ☃.readInt();
/*     */     } else {
/*  69 */       d = 0.0D;
/*     */     } 
/*  71 */     return new es(bool, d);
/*     */   }
/*     */   
/*     */   public static boolean b(StringReader ☃) {
/*     */     boolean bool;
/*  76 */     if (☃.peek() == '~') {
/*  77 */       bool = true;
/*  78 */       ☃.skip();
/*     */     } else {
/*  80 */       bool = false;
/*     */     } 
/*  82 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  87 */     if (this == ☃) {
/*  88 */       return true;
/*     */     }
/*  90 */     if (!(☃ instanceof es)) {
/*  91 */       return false;
/*     */     }
/*     */     
/*  94 */     es es1 = (es)☃;
/*     */     
/*  96 */     if (this.c != es1.c) {
/*  97 */       return false;
/*     */     }
/*  99 */     return (Double.compare(es1.d, this.d) == 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 106 */     int ☃ = this.c ? 1 : 0;
/* 107 */     long l = Double.doubleToLongBits(this.d);
/* 108 */     ☃ = 31 * ☃ + (int)(l ^ l >>> 32L);
/* 109 */     return ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 113 */     return this.c;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\es.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */