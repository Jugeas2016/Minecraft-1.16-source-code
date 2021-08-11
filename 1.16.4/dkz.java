/*    */ import com.mojang.text2speech.Narrator;
/*    */ import java.util.UUID;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
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
/*    */ public class dkz
/*    */   implements dky
/*    */ {
/* 19 */   public static final nr a = oe.d;
/*    */   
/* 21 */   private static final Logger c = LogManager.getLogger();
/*    */ 
/*    */   
/* 24 */   public static final dkz b = new dkz();
/*    */   
/* 26 */   private final Narrator d = Narrator.getNarrator();
/*    */ 
/*    */   
/*    */   public void a(no ☃, nr nr1, UUID uUID) {
/* 30 */     dkb dkb = d();
/* 31 */     if (dkb == dkb.a || !this.d.active()) {
/*    */       return;
/*    */     }
/*    */     
/* 35 */     if (dkb == dkb.b || (dkb == dkb.c && ☃ == no.a) || (dkb == dkb.d && ☃ == no.b)) {
/*    */       nr nr2;
/* 37 */       if (nr1 instanceof of && "chat.type.text".equals(((of)nr1).i())) {
/* 38 */         nr2 = new of("chat.type.text.narrate", ((of)nr1).j());
/*    */       } else {
/* 40 */         nr2 = nr1;
/*    */       } 
/* 42 */       a(☃.b(), nr2.getString());
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(String ☃) {
/* 47 */     dkb dkb = d();
/* 48 */     if (this.d.active() && dkb != dkb.a && dkb != dkb.c && !☃.isEmpty()) {
/* 49 */       this.d.clear();
/* 50 */       a(true, ☃);
/*    */     } 
/*    */   }
/*    */   
/*    */   private static dkb d() {
/* 55 */     return (djz.C()).k.aU;
/*    */   }
/*    */   
/*    */   private void a(boolean ☃, String str) {
/* 59 */     if (w.d) {
/* 60 */       c.debug("Narrating: {}", str.replaceAll("\n", "\\\\n"));
/*    */     }
/*    */     
/* 63 */     this.d.say(str, ☃);
/*    */   }
/*    */   
/*    */   public void a(dkb ☃) {
/* 67 */     b();
/*    */     
/* 69 */     this.d.say((new of("options.narrator")).c(" : ").a(☃.b()).getString(), true);
/*    */     
/* 71 */     dmr dmr = djz.C().an();
/* 72 */     if (this.d.active()) {
/* 73 */       if (☃ == dkb.a) {
/* 74 */         dmp.b(dmr, dmp.a.b, new of("narrator.toast.disabled"), null);
/*    */       } else {
/* 76 */         dmp.b(dmr, dmp.a.b, new of("narrator.toast.enabled"), ☃.b());
/*    */       } 
/*    */     } else {
/* 79 */       dmp.b(dmr, dmp.a.b, new of("narrator.toast.disabled"), new of("options.narrator.notavailable"));
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 84 */     return this.d.active();
/*    */   }
/*    */   
/*    */   public void b() {
/* 88 */     if (d() == dkb.a || !this.d.active()) {
/*    */       return;
/*    */     }
/* 91 */     this.d.clear();
/*    */   }
/*    */   
/*    */   public void c() {
/* 95 */     this.d.destroy();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dkz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */