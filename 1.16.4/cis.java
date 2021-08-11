/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Collector;
/*    */ import java.util.stream.Collectors;
/*    */ import java.util.stream.IntStream;
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
/*    */ public class cis
/*    */   extends cjl<cmh>
/*    */ {
/*    */   public cis(Codec<cmh> ☃) {
/* 25 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmh cmh1) {
/* 30 */     brd brd = new brd(fx1);
/* 31 */     List<Integer> list1 = IntStream.rangeClosed(brd.d(), brd.f()).boxed().collect((Collector)Collectors.toList());
/* 32 */     Collections.shuffle(list1, random);
/* 33 */     List<Integer> list2 = IntStream.rangeClosed(brd.e(), brd.g()).boxed().collect((Collector)Collectors.toList());
/* 34 */     Collections.shuffle(list2, random);
/* 35 */     fx.a a = new fx.a();
/*    */     
/* 37 */     for (Integer integer : list1) {
/* 38 */       for (Integer integer1 : list2) {
/* 39 */         a.d(integer.intValue(), 0, integer1.intValue());
/* 40 */         fx fx2 = ☃.a(chn.a.f, a);
/*    */         
/* 42 */         if (☃.w(fx2) || ☃.d_(fx2).k(☃, fx2).b()) {
/* 43 */           ☃.a(fx2, bup.bR.n(), 2);
/*    */           
/* 45 */           cdd.a(☃, random, fx2, cyq.b);
/*    */           
/* 47 */           ceh ceh = bup.bL.n();
/*    */           
/* 49 */           for (gc gc : gc.c.a) {
/* 50 */             fx fx3 = fx2.a(gc);
/* 51 */             if (ceh.a(☃, fx3)) {
/* 52 */               ☃.a(fx3, ceh, 2);
/*    */             }
/*    */           } 
/* 55 */           return true;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 60 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cis.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */