/*     */ import java.util.Comparator;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class a
/*     */   extends dlv<dnu.a.a>
/*     */ {
/*     */   private a(dnu paramdnu) {
/*  81 */     super(paramdnu.i, paramdnu.k, paramdnu.l, 40, paramdnu.l - 37, 16);
/*     */     
/*  83 */     dnu.a(paramdnu).d().stream().sorted(Comparator.comparing(☃ -> ((vj)☃.getKey()).a().toString())).forEach(☃ -> b(new a(this, (bsv)☃.getValue())));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean b() {
/*  90 */     return (this.a.aw_() == this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable a ☃) {
/*  95 */     super.a(☃);
/*     */     
/*  97 */     if (☃ != null) {
/*  98 */       dnu.a(this.a, a.a(☃));
/*  99 */       dkz.b.a((new of("narrator.select", new Object[] { dnu.a(this.a).b(a.a(☃)) })).getString());
/*     */     } 
/* 101 */     dnu.b(this.a);
/*     */   }
/*     */   
/*     */   class a extends dlv.a<a> {
/*     */     private final bsv b;
/*     */     private final nr c;
/*     */     
/*     */     public a(dnu.a this$0, bsv ☃) {
/* 109 */       this.b = ☃;
/* 110 */       vk vk = dnu.a(this$0.a).b(☃);
/*     */       
/* 112 */       String str = "biome." + vk.b() + "." + vk.a();
/* 113 */       if (ly.a().b(str)) {
/* 114 */         this.c = new of(str);
/*     */       } else {
/* 116 */         this.c = new oe(vk.toString());
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 122 */       dkw.b(☃, this.a.a.o, this.c, k + 5, j + 2, 16777215);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(double ☃, double d1, int i) {
/* 127 */       if (i == 0) {
/*     */ 
/*     */         
/* 130 */         this.a.a(this);
/* 131 */         return true;
/*     */       } 
/* 133 */       return false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dnu$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */