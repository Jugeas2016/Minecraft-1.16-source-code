/*    */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*    */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*    */ 
/*    */ 
/*    */ public enum ge
/*    */   implements afs
/*    */ {
/*  8 */   a("down_east", gc.a, gc.f),
/*  9 */   b("down_north", gc.a, gc.c),
/* 10 */   c("down_south", gc.a, gc.d),
/* 11 */   d("down_west", gc.a, gc.e),
/*    */   
/* 13 */   e("up_east", gc.b, gc.f),
/* 14 */   f("up_north", gc.b, gc.c),
/* 15 */   g("up_south", gc.b, gc.d),
/* 16 */   h("up_west", gc.b, gc.e),
/*    */   
/* 18 */   i("west_up", gc.e, gc.b),
/* 19 */   j("east_up", gc.f, gc.b),
/* 20 */   k("north_up", gc.c, gc.b),
/* 21 */   l("south_up", gc.d, gc.b);
/*    */   
/*    */   static {
/* 24 */     m = (Int2ObjectMap<ge>)new Int2ObjectOpenHashMap((values()).length);
/*    */ 
/*    */     
/* 27 */     for (ge ☃ : values())
/* 28 */       m.put(b(☃.o, ☃.p), ☃); 
/*    */   }
/*    */   
/*    */   private static final Int2ObjectMap<ge> m;
/*    */   private final String n;
/*    */   private final gc o;
/*    */   private final gc p;
/*    */   
/*    */   private static int b(gc ☃, gc gc1) {
/* 37 */     return ☃.ordinal() << 3 | gc1.ordinal();
/*    */   }
/*    */   
/*    */   ge(String ☃, gc gc1, gc gc2) {
/* 41 */     this.n = ☃;
/* 42 */     this.p = gc1;
/* 43 */     this.o = gc2;
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 48 */     return this.n;
/*    */   }
/*    */   
/*    */   public static ge a(gc ☃, gc gc1) {
/* 52 */     int i = b(gc1, ☃);
/* 53 */     return (ge)m.get(i);
/*    */   }
/*    */   
/*    */   public gc b() {
/* 57 */     return this.p;
/*    */   }
/*    */   
/*    */   public gc c() {
/* 61 */     return this.o;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */