/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class et
/*     */   implements em
/*     */ {
/*     */   private final es a;
/*     */   private final es b;
/*     */   private final es c;
/*     */   
/*     */   public et(es ☃, es es1, es es2) {
/*  15 */     this.a = ☃;
/*  16 */     this.b = es1;
/*  17 */     this.c = es2;
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn a(db ☃) {
/*  22 */     dcn dcn = ☃.d();
/*  23 */     return new dcn(this.a.a(dcn.b), this.b.a(dcn.c), this.c.a(dcn.d));
/*     */   }
/*     */ 
/*     */   
/*     */   public dcm b(db ☃) {
/*  28 */     dcm dcm = ☃.i();
/*  29 */     return new dcm((float)this.a.a(dcm.i), (float)this.b.a(dcm.j));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  34 */     return this.a.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  39 */     return this.b.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  44 */     return this.c.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  49 */     if (this == ☃) {
/*  50 */       return true;
/*     */     }
/*  52 */     if (!(☃ instanceof et)) {
/*  53 */       return false;
/*     */     }
/*     */     
/*  56 */     et et1 = (et)☃;
/*     */     
/*  58 */     if (!this.a.equals(et1.a)) {
/*  59 */       return false;
/*     */     }
/*  61 */     if (!this.b.equals(et1.b)) {
/*  62 */       return false;
/*     */     }
/*  64 */     return this.c.equals(et1.c);
/*     */   }
/*     */   
/*     */   public static et a(StringReader ☃) throws CommandSyntaxException {
/*  68 */     int i = ☃.getCursor();
/*  69 */     es es1 = es.a(☃);
/*  70 */     if (!☃.canRead() || ☃.peek() != ' ') {
/*  71 */       ☃.setCursor(i);
/*  72 */       throw er.a.createWithContext(☃);
/*     */     } 
/*  74 */     ☃.skip();
/*  75 */     es es2 = es.a(☃);
/*  76 */     if (!☃.canRead() || ☃.peek() != ' ') {
/*  77 */       ☃.setCursor(i);
/*  78 */       throw er.a.createWithContext(☃);
/*     */     } 
/*  80 */     ☃.skip();
/*  81 */     es es3 = es.a(☃);
/*  82 */     return new et(es1, es2, es3);
/*     */   }
/*     */   
/*     */   public static et a(StringReader ☃, boolean bool) throws CommandSyntaxException {
/*  86 */     int i = ☃.getCursor();
/*  87 */     es es1 = es.a(☃, bool);
/*  88 */     if (!☃.canRead() || ☃.peek() != ' ') {
/*  89 */       ☃.setCursor(i);
/*  90 */       throw er.a.createWithContext(☃);
/*     */     } 
/*  92 */     ☃.skip();
/*  93 */     es es2 = es.a(☃, false);
/*  94 */     if (!☃.canRead() || ☃.peek() != ' ') {
/*  95 */       ☃.setCursor(i);
/*  96 */       throw er.a.createWithContext(☃);
/*     */     } 
/*  98 */     ☃.skip();
/*  99 */     es es3 = es.a(☃, bool);
/* 100 */     return new et(es1, es2, es3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static et d() {
/* 112 */     return new et(new es(true, 0.0D), new es(true, 0.0D), new es(true, 0.0D));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 117 */     int ☃ = this.a.hashCode();
/* 118 */     ☃ = 31 * ☃ + this.b.hashCode();
/* 119 */     ☃ = 31 * ☃ + this.c.hashCode();
/* 120 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\et.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */