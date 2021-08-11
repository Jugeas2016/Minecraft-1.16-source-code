/*     */ import java.io.IOException;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class sp
/*     */   implements oj<sa>
/*     */ {
/*     */   private int a;
/*     */   private a b;
/*     */   private dcn c;
/*     */   private aot d;
/*     */   private boolean e;
/*     */   
/*     */   public sp() {}
/*     */   
/*     */   public sp(aqa ☃, boolean bool) {
/*  24 */     this.a = ☃.Y();
/*  25 */     this.b = a.b;
/*  26 */     this.e = bool;
/*     */   }
/*     */   
/*     */   public sp(aqa ☃, aot aot1, boolean bool) {
/*  30 */     this.a = ☃.Y();
/*  31 */     this.b = a.a;
/*  32 */     this.d = aot1;
/*  33 */     this.e = bool;
/*     */   }
/*     */   
/*     */   public sp(aqa ☃, aot aot1, dcn dcn1, boolean bool) {
/*  37 */     this.a = ☃.Y();
/*  38 */     this.b = a.c;
/*  39 */     this.d = aot1;
/*  40 */     this.c = dcn1;
/*  41 */     this.e = bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/*  46 */     this.a = ☃.i();
/*  47 */     this.b = ☃.<a>a(a.class);
/*  48 */     if (this.b == a.c) {
/*  49 */       this.c = new dcn(☃.readFloat(), ☃.readFloat(), ☃.readFloat());
/*     */     }
/*  51 */     if (this.b == a.a || this.b == a.c) {
/*  52 */       this.d = ☃.<aot>a(aot.class);
/*     */     }
/*  54 */     this.e = ☃.readBoolean();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/*  59 */     ☃.d(this.a);
/*  60 */     ☃.a(this.b);
/*  61 */     if (this.b == a.c) {
/*  62 */       ☃.writeFloat((float)this.c.b);
/*  63 */       ☃.writeFloat((float)this.c.c);
/*  64 */       ☃.writeFloat((float)this.c.d);
/*     */     } 
/*  66 */     if (this.b == a.a || this.b == a.c) {
/*  67 */       ☃.a(this.d);
/*     */     }
/*  69 */     ☃.writeBoolean(this.e);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(sa ☃) {
/*  74 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aqa a(brx ☃) {
/*  79 */     return ☃.a(this.a);
/*     */   }
/*     */   
/*     */   public a b() {
/*  83 */     return this.b;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aot c() {
/*  88 */     return this.d;
/*     */   }
/*     */   
/*     */   public dcn d() {
/*  92 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean e() {
/*  96 */     return this.e;
/*     */   }
/*     */   
/*     */   public enum a {
/* 100 */     a,
/* 101 */     b,
/* 102 */     c;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\sp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */