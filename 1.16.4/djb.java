/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class djb
/*    */   extends dja
/*    */ {
/*    */   private final dgq c;
/*    */   private final dot d;
/*    */   private final boolean e;
/*    */   private final dfw f;
/*    */   
/*    */   public djb(dgq ☃, dot dot1, dfw dfw1, boolean bool) {
/* 18 */     this.c = ☃;
/* 19 */     this.d = dot1;
/* 20 */     this.e = bool;
/* 21 */     this.f = dfw1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 26 */     b(new of("mco.configure.world.opening"));
/* 27 */     dgb ☃ = dgb.a();
/*    */     
/* 29 */     for (int i = 0; i < 25; i++) {
/* 30 */       if (c()) {
/*    */         return;
/*    */       }
/*    */       
/*    */       try {
/* 35 */         boolean bool = ☃.e(this.c.a).booleanValue();
/* 36 */         if (bool) {
/* 37 */           if (this.d instanceof dhs) {
/* 38 */             ((dhs)this.d).a();
/*    */           }
/*    */           
/* 41 */           this.c.e = dgq.b.b;
/*    */           
/* 43 */           if (this.e) {
/* 44 */             this.f.a(this.c, this.d);
/*    */             
/*    */             break;
/*    */           } 
/* 48 */           a(this.d);
/*    */           break;
/*    */         } 
/* 51 */       } catch (dhj dhj) {
/* 52 */         if (c()) {
/*    */           return;
/*    */         }
/* 55 */         a(dhj.e);
/* 56 */       } catch (Exception exception) {
/* 57 */         if (c()) {
/*    */           return;
/*    */         }
/* 60 */         a.error("Failed to open server", exception);
/* 61 */         a("Failed to open the server");
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */