/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.Arrays;
/*     */ import java.util.function.Function;
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
/*     */ 
/*     */ 
/*     */ public class chl
/*     */   extends cfy
/*     */ {
/*  21 */   public static final Codec<chl> d = cpf.a.fieldOf("settings").xmap(chl::new, chl::g).codec();
/*     */   
/*     */   private final cpf e;
/*     */   
/*     */   public chl(cpf ☃) {
/*  26 */     super(new btd(☃.c()), new btd(☃.e()), ☃.d(), 0L);
/*  27 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Codec<? extends cfy> a() {
/*  32 */     return (Codec)d;
/*     */   }
/*     */ 
/*     */   
/*     */   public cfy a(long ☃) {
/*  37 */     return this;
/*     */   }
/*     */   
/*     */   public cpf g() {
/*  41 */     return this.e;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aam ☃, cfw cfw1) {}
/*     */ 
/*     */   
/*     */   public int c() {
/*  50 */     ceh[] ☃ = this.e.g();
/*  51 */     for (int i = 0; i < ☃.length; i++) {
/*  52 */       ceh ceh = (☃[i] == null) ? bup.a.n() : ☃[i];
/*  53 */       if (!chn.a.e.e().test(ceh)) {
/*  54 */         return i - 1;
/*     */       }
/*     */     } 
/*  57 */     return ☃.length;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bry ☃, bsn bsn1, cfw cfw1) {
/*  64 */     ceh[] arrayOfCeh = this.e.g();
/*     */     
/*  66 */     fx.a a = new fx.a();
/*  67 */     chn chn1 = cfw1.a(chn.a.c);
/*  68 */     chn chn2 = cfw1.a(chn.a.a);
/*     */     
/*  70 */     for (int i = 0; i < arrayOfCeh.length; i++) {
/*  71 */       ceh ceh = arrayOfCeh[i];
/*  72 */       if (ceh != null)
/*     */       {
/*     */ 
/*     */         
/*  76 */         for (int j = 0; j < 16; j++) {
/*  77 */           for (int k = 0; k < 16; k++) {
/*  78 */             cfw1.a(a.d(j, i, k), ceh, false);
/*  79 */             chn1.a(j, i, k, ceh);
/*  80 */             chn2.a(j, i, k, ceh);
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public int a(int ☃, int i, chn.a a1) {
/*  88 */     ceh[] arrayOfCeh = this.e.g();
/*  89 */     for (int j = arrayOfCeh.length - 1; j >= 0; j--) {
/*  90 */       ceh ceh = arrayOfCeh[j];
/*  91 */       if (ceh != null)
/*     */       {
/*     */         
/*  94 */         if (a1.e().test(ceh))
/*  95 */           return j + 1; 
/*     */       }
/*     */     } 
/*  98 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public brc a(int ☃, int i) {
/* 103 */     return new bsh((ceh[])Arrays.<ceh>stream(this.e.g()).map(☃ -> (☃ == null) ? bup.a.n() : ☃).toArray(☃ -> new ceh[☃]));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\chl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */