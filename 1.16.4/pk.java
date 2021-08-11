/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class pk
/*    */   implements oj<om>
/*    */ {
/* 14 */   public static final vk a = new vk("brand");
/* 15 */   public static final vk b = new vk("debug/path");
/* 16 */   public static final vk c = new vk("debug/neighbors_update");
/* 17 */   public static final vk d = new vk("debug/caves");
/* 18 */   public static final vk e = new vk("debug/structures");
/* 19 */   public static final vk f = new vk("debug/worldgen_attempt");
/* 20 */   public static final vk g = new vk("debug/poi_ticket_count");
/* 21 */   public static final vk h = new vk("debug/poi_added");
/* 22 */   public static final vk i = new vk("debug/poi_removed");
/* 23 */   public static final vk j = new vk("debug/village_sections");
/* 24 */   public static final vk k = new vk("debug/goal_selector");
/* 25 */   public static final vk l = new vk("debug/brain");
/* 26 */   public static final vk m = new vk("debug/bee");
/* 27 */   public static final vk n = new vk("debug/hive");
/* 28 */   public static final vk o = new vk("debug/game_test_add_marker");
/* 29 */   public static final vk p = new vk("debug/game_test_clear");
/* 30 */   public static final vk q = new vk("debug/raids");
/*    */   
/*    */   private vk r;
/*    */   
/*    */   private nf s;
/*    */   
/*    */   public pk() {}
/*    */   
/*    */   public pk(vk ☃, nf nf1) {
/* 39 */     this.r = ☃;
/* 40 */     this.s = nf1;
/*    */     
/* 42 */     if (nf1.writerIndex() > 1048576) {
/* 43 */       throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 49 */     this.r = ☃.p();
/* 50 */     int i = ☃.readableBytes();
/* 51 */     if (i < 0 || i > 1048576) {
/* 52 */       throw new IOException("Payload may not be larger than 1048576 bytes");
/*    */     }
/* 54 */     this.s = new nf(☃.readBytes(i));
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 59 */     ☃.a(this.r);
/* 60 */     ☃.writeBytes(this.s.copy());
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 65 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public vk b() {
/* 69 */     return this.r;
/*    */   }
/*    */   
/*    */   public nf c() {
/* 73 */     return new nf(this.s.copy());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\pk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */