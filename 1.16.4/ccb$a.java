/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import org.apache.commons.lang3.tuple.Pair;
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
/*     */ public class a
/*     */ {
/* 104 */   private final List<Pair<ccb, bkx>> a = Lists.newArrayList();
/*     */   
/*     */   public a a(ccb ☃, bkx bkx1) {
/* 107 */     this.a.add(Pair.of(☃, bkx1));
/* 108 */     return this;
/*     */   }
/*     */   
/*     */   public mj a() {
/* 112 */     mj ☃ = new mj();
/*     */     
/* 114 */     for (Pair<ccb, bkx> pair : this.a) {
/* 115 */       md md = new md();
/* 116 */       md.a("Pattern", ccb.a((ccb)pair.getLeft()));
/* 117 */       md.b("Color", ((bkx)pair.getRight()).b());
/* 118 */       ☃.add(md);
/*     */     } 
/*     */     
/* 121 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ccb$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */