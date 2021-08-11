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
/*    */ public class bod
/*    */   extends boj
/*    */ {
/*    */   public bod(vk ☃) {
/* 16 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bio ☃, brx brx1) {
/* 21 */     bmb bmb = bmb.b;
/* 22 */     List<bmb> list = Lists.newArrayList();
/*    */     
/* 24 */     for (int i = 0; i < ☃.Z_(); i++) {
/* 25 */       bmb bmb1 = ☃.a(i);
/* 26 */       if (!bmb1.a())
/*    */       {
/*    */ 
/*    */         
/* 30 */         if (bmb1.b() instanceof blb) {
/* 31 */           if (!bmb.a()) {
/* 32 */             return false;
/*    */           }
/* 34 */           bmb = bmb1;
/* 35 */         } else if (bmb1.b() instanceof bky) {
/* 36 */           list.add(bmb1);
/*    */         } else {
/* 38 */           return false;
/*    */         } 
/*    */       }
/*    */     } 
/* 42 */     return (!bmb.a() && !list.isEmpty());
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bio ☃) {
/* 47 */     List<bky> list = Lists.newArrayList();
/* 48 */     bmb bmb = bmb.b;
/*    */     
/* 50 */     for (int i = 0; i < ☃.Z_(); i++) {
/* 51 */       bmb bmb1 = ☃.a(i);
/* 52 */       if (!bmb1.a()) {
/*    */ 
/*    */ 
/*    */         
/* 56 */         blx blx = bmb1.b();
/* 57 */         if (blx instanceof blb) {
/* 58 */           if (!bmb.a()) {
/* 59 */             return bmb.b;
/*    */           }
/*    */           
/* 62 */           bmb = bmb1.i();
/* 63 */         } else if (blx instanceof bky) {
/* 64 */           list.add((bky)blx);
/*    */         } else {
/* 66 */           return bmb.b;
/*    */         } 
/*    */       } 
/*    */     } 
/* 70 */     if (bmb.a() || list.isEmpty()) {
/* 71 */       return bmb.b;
/*    */     }
/*    */     
/* 74 */     return blb.a(bmb, list);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(int ☃, int i) {
/* 79 */     return (☃ * i >= 2);
/*    */   }
/*    */ 
/*    */   
/*    */   public bos<?> ag_() {
/* 84 */     return bos.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */