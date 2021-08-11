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
/*    */ public class box
/*    */   extends boj
/*    */ {
/*    */   public box(vk ☃) {
/* 15 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bio ☃, brx brx1) {
/* 20 */     bmb bmb1 = bmb.b;
/* 21 */     bmb bmb2 = bmb.b;
/*    */     
/* 23 */     for (int i = 0; i < ☃.Z_(); i++) {
/* 24 */       bmb bmb = ☃.a(i);
/* 25 */       if (!bmb.a())
/*    */       {
/*    */ 
/*    */         
/* 29 */         if (bmb.b() instanceof bke) {
/* 30 */           if (!bmb2.a())
/*    */           {
/* 32 */             return false;
/*    */           }
/* 34 */           bmb2 = bmb;
/* 35 */         } else if (bmb.b() == bmd.qn) {
/* 36 */           if (!bmb1.a())
/*    */           {
/* 38 */             return false;
/*    */           }
/* 40 */           if (bmb.b("BlockEntityTag") != null)
/*    */           {
/* 42 */             return false;
/*    */           }
/* 44 */           bmb1 = bmb;
/*    */         } else {
/*    */           
/* 47 */           return false;
/*    */         } 
/*    */       }
/*    */     } 
/* 51 */     if (bmb1.a() || bmb2.a())
/*    */     {
/* 53 */       return false;
/*    */     }
/*    */     
/* 56 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bio ☃) {
/* 61 */     bmb bmb1 = bmb.b;
/* 62 */     bmb bmb2 = bmb.b;
/*    */     
/* 64 */     for (int i = 0; i < ☃.Z_(); i++) {
/* 65 */       bmb bmb = ☃.a(i);
/* 66 */       if (!bmb.a())
/*    */       {
/*    */ 
/*    */         
/* 70 */         if (bmb.b() instanceof bke) {
/* 71 */           bmb1 = bmb;
/* 72 */         } else if (bmb.b() == bmd.qn) {
/* 73 */           bmb2 = bmb.i();
/*    */         } 
/*    */       }
/*    */     } 
/* 77 */     if (bmb2.a()) {
/* 78 */       return bmb2;
/*    */     }
/*    */     
/* 81 */     md md1 = bmb1.b("BlockEntityTag");
/* 82 */     md md2 = (md1 == null) ? new md() : md1.g();
/*    */     
/* 84 */     md2.b("Base", ((bke)bmb1.b()).b().b());
/*    */     
/* 86 */     bmb2.a("BlockEntityTag", md2);
/*    */     
/* 88 */     return bmb2;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(int ☃, int i) {
/* 93 */     return (☃ * i >= 2);
/*    */   }
/*    */ 
/*    */   
/*    */   public bos<?> ag_() {
/* 98 */     return bos.l;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\box.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */