/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Random;
/*    */ import javax.annotation.Nullable;
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
/*    */ 
/*    */ public class ary
/*    */   extends arv<bfj>
/*    */ {
/*    */   @Nullable
/*    */   private bhb b;
/*    */   
/*    */   public ary(int ☃, int i) {
/* 27 */     super((Map<ayd<?>, aye>)ImmutableMap.of(), ☃, i);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, bfj bfj1) {
/* 32 */     fx fx = bfj1.cB();
/* 33 */     this.b = ☃.b_(fx);
/* 34 */     return (this.b != null && this.b.e() && asx.a(☃, bfj1, fx));
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, bfj bfj1, long l) {
/* 39 */     return (this.b != null && !this.b.d());
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b(aag ☃, bfj bfj1, long l) {
/* 44 */     this.b = null;
/* 45 */     bfj1.cJ().a(☃.U(), ☃.T());
/*    */   }
/*    */ 
/*    */   
/*    */   protected void c(aag ☃, bfj bfj1, long l) {
/* 50 */     Random random = bfj1.cY();
/*    */     
/* 52 */     if (random.nextInt(100) == 0) {
/* 53 */       bfj1.eR();
/*    */     }
/*    */     
/* 56 */     if (random.nextInt(200) == 0 && asx.a(☃, bfj1, bfj1.cB())) {
/* 57 */       bkx bkx = x.<bkx>a(bkx.values(), random);
/* 58 */       int i = random.nextInt(3);
/* 59 */       bmb bmb = a(bkx, i);
/*    */       
/* 61 */       bgh bgh = new bgh(bfj1.l, bfj1, bfj1.cD(), bfj1.cG(), bfj1.cH(), bmb);
/* 62 */       bfj1.l.c(bgh);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   private bmb a(bkx ☃, int i) {
/* 68 */     bmb bmb1 = new bmb(bmd.po, 1);
/*    */     
/* 70 */     bmb bmb2 = new bmb(bmd.pp);
/* 71 */     md md1 = bmb2.a("Explosion");
/*    */     
/* 73 */     List<Integer> list = Lists.newArrayList();
/* 74 */     list.add(Integer.valueOf(☃.g()));
/*    */     
/* 76 */     md1.b("Colors", list);
/* 77 */     md1.a("Type", (byte)blm.a.e.a());
/*    */     
/* 79 */     md md2 = bmb1.a("Fireworks");
/* 80 */     mj mj = new mj();
/*    */     
/* 82 */     md md3 = bmb2.b("Explosion");
/* 83 */     if (md3 != null) {
/* 84 */       mj.add(md3);
/*    */     }
/*    */     
/* 87 */     md2.a("Flight", (byte)i);
/* 88 */     if (!mj.isEmpty()) {
/* 89 */       md2.a("Explosions", mj);
/*    */     }
/*    */     
/* 92 */     return bmb1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ary.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */