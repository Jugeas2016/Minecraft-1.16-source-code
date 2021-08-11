/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class me
/*     */   extends mq
/*     */ {
/*  19 */   public static final me a = new me(0.0D);
/*     */   
/*  21 */   public static final mv<me> b = new mv<me>()
/*     */     {
/*     */       public me a(DataInput ☃, int i, mm mm1) throws IOException {
/*  24 */         mm1.a(128L);
/*  25 */         return me.a(☃.readDouble());
/*     */       }
/*     */ 
/*     */       
/*     */       public String a() {
/*  30 */         return "DOUBLE";
/*     */       }
/*     */ 
/*     */       
/*     */       public String b() {
/*  35 */         return "TAG_Double";
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean c() {
/*  40 */         return true;
/*     */       }
/*     */     };
/*     */   
/*     */   private final double c;
/*     */   
/*     */   private me(double ☃) {
/*  47 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public static me a(double ☃) {
/*  51 */     if (☃ == 0.0D) {
/*  52 */       return a;
/*     */     }
/*  54 */     return new me(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/*  59 */     ☃.writeDouble(this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/*  64 */     return 6;
/*     */   }
/*     */ 
/*     */   
/*     */   public mv<me> b() {
/*  69 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  74 */     return this.c + "d";
/*     */   }
/*     */ 
/*     */   
/*     */   public me d() {
/*  79 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  84 */     if (this == ☃) {
/*  85 */       return true;
/*     */     }
/*     */     
/*  88 */     return (☃ instanceof me && this.c == ((me)☃).c);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  93 */     long ☃ = Double.doubleToLongBits(this.c);
/*  94 */     return (int)(☃ ^ ☃ >>> 32L);
/*     */   }
/*     */ 
/*     */   
/*     */   public nr a(String ☃, int i) {
/*  99 */     nr nr = (new oe("d")).a(g);
/* 100 */     return (new oe(String.valueOf(this.c))).a(nr).a(f);
/*     */   }
/*     */ 
/*     */   
/*     */   public long e() {
/* 105 */     return (long)Math.floor(this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 110 */     return afm.c(this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public short g() {
/* 115 */     return (short)(afm.c(this.c) & 0xFFFF);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte h() {
/* 120 */     return (byte)(afm.c(this.c) & 0xFF);
/*     */   }
/*     */ 
/*     */   
/*     */   public double i() {
/* 125 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public float j() {
/* 130 */     return (float)this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public Number k() {
/* 135 */     return Double.valueOf(this.c);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\me.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */