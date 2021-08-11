/*    */ import com.google.common.collect.Lists;
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
/*    */ public class bol
/*    */   extends boj
/*    */ {
/* 16 */   private static final bon a = bon.a(new brw[] { bmd.pp });
/*    */   
/*    */   public bol(vk ☃) {
/* 19 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bio ☃, brx brx1) {
/* 24 */     boolean bool1 = false;
/* 25 */     boolean bool2 = false;
/*    */     
/* 27 */     for (int i = 0; i < ☃.Z_(); i++) {
/* 28 */       bmb bmb = ☃.a(i);
/* 29 */       if (!bmb.a())
/*    */       {
/*    */ 
/*    */         
/* 33 */         if (bmb.b() instanceof bky) {
/* 34 */           bool1 = true;
/* 35 */         } else if (a.a(bmb)) {
/* 36 */           if (bool2) {
/* 37 */             return false;
/*    */           }
/* 39 */           bool2 = true;
/*    */         } else {
/* 41 */           return false;
/*    */         } 
/*    */       }
/*    */     } 
/* 45 */     return (bool2 && bool1);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bio ☃) {
/* 50 */     List<Integer> list = Lists.newArrayList();
/* 51 */     bmb bmb = null;
/*    */     
/* 53 */     for (int i = 0; i < ☃.Z_(); i++) {
/* 54 */       bmb bmb1 = ☃.a(i);
/*    */       
/* 56 */       blx blx = bmb1.b();
/* 57 */       if (blx instanceof bky) {
/* 58 */         list.add(Integer.valueOf(((bky)blx).d().g()));
/* 59 */       } else if (a.a(bmb1)) {
/* 60 */         bmb = bmb1.i();
/* 61 */         bmb.e(1);
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 66 */     if (bmb == null || list.isEmpty()) {
/* 67 */       return bmb.b;
/*    */     }
/*    */     
/* 70 */     bmb.a("Explosion").b("FadeColors", list);
/*    */     
/* 72 */     return bmb;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(int ☃, int i) {
/* 77 */     return (☃ * i >= 2);
/*    */   }
/*    */ 
/*    */   
/*    */   public bos<?> ag_() {
/* 82 */     return bos.i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bol.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */