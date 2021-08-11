/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.Queue;
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
/*    */ 
/*    */ 
/*    */ public class cag
/*    */   extends buo
/*    */ {
/*    */   protected cag(ceg.c ☃) {
/* 22 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 27 */     if (ceh1.a(☃.b())) {
/*    */       return;
/*    */     }
/* 30 */     a(brx1, fx1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/* 35 */     a(brx1, fx1);
/* 36 */     super.a(☃, brx1, fx1, buo1, fx2, bool);
/*    */   }
/*    */   
/*    */   protected void a(brx ☃, fx fx1) {
/* 40 */     if (b(☃, fx1)) {
/*    */       
/* 42 */       ☃.a(fx1, bup.ao.n(), 2);
/* 43 */       ☃.c(2001, fx1, buo.i(bup.A.n()));
/*    */     } 
/*    */   }
/*    */   
/*    */   private boolean b(brx ☃, fx fx1) {
/* 48 */     Queue<afv<fx, Integer>> queue = Lists.newLinkedList();
/* 49 */     queue.add(new afv<>(fx1, Integer.valueOf(0)));
/*    */     
/* 51 */     int i = 0;
/* 52 */     while (!queue.isEmpty()) {
/* 53 */       afv<fx, Integer> afv = queue.poll();
/* 54 */       fx fx2 = afv.a();
/* 55 */       int j = ((Integer)afv.b()).intValue();
/*    */       
/* 57 */       for (gc gc : gc.values()) {
/* 58 */         fx fx3 = fx2.a(gc);
/* 59 */         ceh ceh = ☃.d_(fx3);
/* 60 */         cux cux = ☃.b(fx3);
/* 61 */         cva cva = ceh.c();
/* 62 */         if (cux.a(aef.b)) {
/* 63 */           if (ceh.b() instanceof but && ((but)ceh.b()).b(☃, fx3, ceh) != cuy.a) {
/* 64 */             i++;
/* 65 */             if (j < 6) {
/* 66 */               queue.add(new afv<>(fx3, Integer.valueOf(j + 1)));
/*    */             }
/* 68 */           } else if (ceh.b() instanceof byb) {
/* 69 */             ☃.a(fx3, bup.a.n(), 3);
/* 70 */             i++;
/* 71 */             if (j < 6) {
/* 72 */               queue.add(new afv<>(fx3, Integer.valueOf(j + 1)));
/*    */             }
/* 74 */           } else if (cva == cva.f || cva == cva.i) {
/* 75 */             ccj ccj = ceh.b().q() ? ☃.c(fx3) : null;
/* 76 */             a(ceh, ☃, fx3, ccj);
/* 77 */             ☃.a(fx3, bup.a.n(), 3);
/* 78 */             i++;
/* 79 */             if (j < 6) {
/* 80 */               queue.add(new afv<>(fx3, Integer.valueOf(j + 1)));
/*    */             }
/*    */           } 
/*    */         }
/*    */       } 
/* 85 */       if (i > 64) {
/*    */         break;
/*    */       }
/*    */     } 
/* 89 */     return (i > 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */