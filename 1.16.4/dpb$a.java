/*     */ import it.unimi.dsi.fastutil.objects.ObjectArrayList;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectListIterator;
/*     */ import java.util.Comparator;
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
/*     */   extends dlv<dpb.a.a>
/*     */ {
/*     */   public a(dpb paramdpb, djz ☃) {
/* 131 */     super(☃, paramdpb.k, paramdpb.l, 32, paramdpb.l - 64, 10);
/*     */     
/* 133 */     ObjectArrayList<adx<vk>> objectArrayList = new ObjectArrayList(aea.i.iterator());
/* 134 */     objectArrayList.sort(Comparator.comparing(☃ -> ekx.a(dpb.a(☃), new Object[0])));
/* 135 */     for (ObjectListIterator<adx<vk>> objectListIterator = objectArrayList.iterator(); objectListIterator.hasNext(); ) { adx<vk> adx = objectListIterator.next();
/* 136 */       b(new a(adx)); }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃) {
/* 142 */     this.a.a(☃);
/*     */   }
/*     */   
/*     */   class a extends dlv.a<a> {
/*     */     private final adx<vk> b;
/*     */     private final nr c;
/*     */     
/*     */     private a(dpb.a this$0, adx<vk> ☃) {
/* 150 */       this.b = ☃;
/* 151 */       this.c = new of(dpb.a(☃));
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 156 */       dkw.b(☃, dpb.a(this.a.a), this.c, k + 2, j + 1, (i % 2 == 0) ? 16777215 : 9474192);
/* 157 */       String str = this.b.a(dpb.b(this.a.a).a(this.b));
/* 158 */       dkw.b(☃, dpb.c(this.a.a), str, k + 2 + 213 - dpb.d(this.a.a).b(str), j + 1, (i % 2 == 0) ? 16777215 : 9474192);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpb$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */