/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class clc
/*    */   extends cla<cmh>
/*    */ {
/* 19 */   private static final List<btg.c> u = (List<btg.c>)ImmutableList.of(new btg.c(aqe.aS, 1, 1, 1));
/* 20 */   private static final List<btg.c> v = (List<btg.c>)ImmutableList.of(new btg.c(aqe.h, 1, 1, 1));
/*    */   
/*    */   public clc(Codec<cmh> ☃) {
/* 23 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public cla.a<cmh> a() {
/* 28 */     return a::new;
/*    */   }
/*    */   
/*    */   public static class a extends crv<cmh> {
/*    */     public a(cla<cmh> ☃, int i, int j, cra cra1, int k, long l) {
/* 33 */       super(☃, i, j, cra1, k, l);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(gn ☃, cfy cfy1, csw csw1, int i, int j, bsv bsv1, cmh cmh1) {
/* 38 */       crw crw = new crw(this.d, i * 16, j * 16);
/* 39 */       this.b.add(crw);
/* 40 */       b();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public List<btg.c> c() {
/* 46 */     return u;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<btg.c> j() {
/* 51 */     return v;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\clc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */