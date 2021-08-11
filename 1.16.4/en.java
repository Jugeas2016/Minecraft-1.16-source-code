/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.Objects;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class en
/*     */   implements em
/*     */ {
/*     */   private final double a;
/*     */   private final double b;
/*     */   private final double c;
/*     */   
/*     */   public en(double ☃, double d1, double d2) {
/*  20 */     this.a = ☃;
/*  21 */     this.b = d1;
/*  22 */     this.c = d2;
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn a(db ☃) {
/*  27 */     dcm dcm = ☃.i();
/*  28 */     dcn dcn1 = ☃.k().a(☃);
/*  29 */     float f1 = afm.b((dcm.j + 90.0F) * 0.017453292F);
/*  30 */     float f2 = afm.a((dcm.j + 90.0F) * 0.017453292F);
/*  31 */     float f3 = afm.b(-dcm.i * 0.017453292F);
/*  32 */     float f4 = afm.a(-dcm.i * 0.017453292F);
/*  33 */     float f5 = afm.b((-dcm.i + 90.0F) * 0.017453292F);
/*  34 */     float f6 = afm.a((-dcm.i + 90.0F) * 0.017453292F);
/*  35 */     dcn dcn2 = new dcn((f1 * f3), f4, (f2 * f3));
/*  36 */     dcn dcn3 = new dcn((f1 * f5), f6, (f2 * f5));
/*  37 */     dcn dcn4 = dcn2.c(dcn3).a(-1.0D);
/*  38 */     double d1 = dcn2.b * this.c + dcn3.b * this.b + dcn4.b * this.a;
/*  39 */     double d2 = dcn2.c * this.c + dcn3.c * this.b + dcn4.c * this.a;
/*  40 */     double d3 = dcn2.d * this.c + dcn3.d * this.b + dcn4.d * this.a;
/*  41 */     return new dcn(dcn1.b + d1, dcn1.c + d2, dcn1.d + d3);
/*     */   }
/*     */ 
/*     */   
/*     */   public dcm b(db ☃) {
/*  46 */     return dcm.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  51 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  56 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  61 */     return true;
/*     */   }
/*     */   
/*     */   public static en a(StringReader ☃) throws CommandSyntaxException {
/*  65 */     int i = ☃.getCursor();
/*  66 */     double d1 = a(☃, i);
/*  67 */     if (!☃.canRead() || ☃.peek() != ' ') {
/*  68 */       ☃.setCursor(i);
/*  69 */       throw er.a.createWithContext(☃);
/*     */     } 
/*  71 */     ☃.skip();
/*  72 */     double d2 = a(☃, i);
/*  73 */     if (!☃.canRead() || ☃.peek() != ' ') {
/*  74 */       ☃.setCursor(i);
/*  75 */       throw er.a.createWithContext(☃);
/*     */     } 
/*  77 */     ☃.skip();
/*  78 */     double d3 = a(☃, i);
/*  79 */     return new en(d1, d2, d3);
/*     */   }
/*     */   
/*     */   private static double a(StringReader ☃, int i) throws CommandSyntaxException {
/*  83 */     if (!☃.canRead()) {
/*  84 */       throw es.a.createWithContext(☃);
/*     */     }
/*     */     
/*  87 */     if (☃.peek() != '^') {
/*  88 */       ☃.setCursor(i);
/*  89 */       throw er.b.createWithContext(☃);
/*     */     } 
/*  91 */     ☃.skip();
/*     */     
/*  93 */     return (☃.canRead() && ☃.peek() != ' ') ? ☃.readDouble() : 0.0D;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  98 */     if (this == ☃) {
/*  99 */       return true;
/*     */     }
/* 101 */     if (!(☃ instanceof en)) {
/* 102 */       return false;
/*     */     }
/*     */     
/* 105 */     en en1 = (en)☃;
/*     */     
/* 107 */     return (this.a == en1.a && this.b == en1.b && this.c == en1.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 112 */     return Objects.hash(new Object[] { Double.valueOf(this.a), Double.valueOf(this.b), Double.valueOf(this.c) });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\en.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */