/*    */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*    */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*    */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*    */ import java.util.Map;
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
/*    */ public class ead
/*    */ {
/* 18 */   public final Int2ObjectMap<elu> a = (Int2ObjectMap<elu>)new Int2ObjectOpenHashMap(256);
/* 19 */   private final Int2ObjectMap<elo> b = (Int2ObjectMap<elo>)new Int2ObjectOpenHashMap(256);
/*    */   private final elt c;
/*    */   
/*    */   public ead(elt ☃) {
/* 23 */     this.c = ☃;
/*    */   }
/*    */   
/*    */   public ekc a(brw ☃) {
/* 27 */     return a(new bmb(☃));
/*    */   }
/*    */   
/*    */   public ekc a(bmb ☃) {
/* 31 */     elo elo = b(☃);
/* 32 */     if (elo == this.c.a() && ☃.b() instanceof bkh) {
/* 33 */       return this.c.b().a(((bkh)☃.b()).e().n());
/*    */     }
/* 35 */     return elo.e();
/*    */   }
/*    */   
/*    */   public elo b(bmb ☃) {
/* 39 */     elo elo = a(☃.b());
/*    */     
/* 41 */     return (elo == null) ? this.c.a() : elo;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public elo a(blx ☃) {
/* 46 */     return (elo)this.b.get(b(☃));
/*    */   }
/*    */   
/*    */   private static int b(blx ☃) {
/* 50 */     return blx.a(☃);
/*    */   }
/*    */   
/*    */   public void a(blx ☃, elu elu1) {
/* 54 */     this.a.put(b(☃), elu1);
/*    */   }
/*    */   
/*    */   public elt a() {
/* 58 */     return this.c;
/*    */   }
/*    */   
/*    */   public void b() {
/* 62 */     this.b.clear();
/* 63 */     for (ObjectIterator<Map.Entry<Integer, elu>> objectIterator = this.a.entrySet().iterator(); objectIterator.hasNext(); ) { Map.Entry<Integer, elu> ☃ = objectIterator.next();
/* 64 */       this.b.put(☃.getKey(), this.c.a(☃.getValue())); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ead.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */