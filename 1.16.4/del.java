/*      */ import com.google.common.base.Joiner;
/*      */ import com.google.common.collect.ImmutableList;
/*      */ import com.google.common.collect.Maps;
/*      */ import com.mojang.blaze3d.platform.GLX;
/*      */ import com.mojang.blaze3d.systems.RenderSystem;
/*      */ import java.nio.ByteBuffer;
/*      */ import java.nio.FloatBuffer;
/*      */ import java.nio.IntBuffer;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
/*      */ import org.lwjgl.opengl.ARBDebugOutput;
/*      */ import org.lwjgl.opengl.GL;
/*      */ import org.lwjgl.opengl.GL11;
/*      */ import org.lwjgl.opengl.GLCapabilities;
/*      */ import org.lwjgl.opengl.GLDebugMessageARBCallback;
/*      */ import org.lwjgl.opengl.GLDebugMessageARBCallbackI;
/*      */ import org.lwjgl.opengl.GLDebugMessageCallback;
/*      */ import org.lwjgl.opengl.GLDebugMessageCallbackI;
/*      */ import org.lwjgl.opengl.KHRDebug;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class del
/*      */ {
/*   33 */   private static final Logger d = LogManager.getLogger();
/*      */   
/*      */   private static String a(int ☃) {
/*   36 */     return "Unknown (0x" + Integer.toHexString(☃).toUpperCase() + ")";
/*      */   }
/*      */   
/*      */   private static String b(int ☃) {
/*   40 */     switch (☃) {
/*      */       case 33350:
/*   42 */         return "API";
/*      */       case 33351:
/*   44 */         return "WINDOW SYSTEM";
/*      */       case 33352:
/*   46 */         return "SHADER COMPILER";
/*      */       case 33353:
/*   48 */         return "THIRD PARTY";
/*      */       case 33354:
/*   50 */         return "APPLICATION";
/*      */       case 33355:
/*   52 */         return "OTHER";
/*      */     } 
/*   54 */     return a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   private static String c(int ☃) {
/*   59 */     switch (☃) {
/*      */       case 33356:
/*   61 */         return "ERROR";
/*      */       case 33357:
/*   63 */         return "DEPRECATED BEHAVIOR";
/*      */       case 33358:
/*   65 */         return "UNDEFINED BEHAVIOR";
/*      */       case 33359:
/*   67 */         return "PORTABILITY";
/*      */       case 33360:
/*   69 */         return "PERFORMANCE";
/*      */       case 33361:
/*   71 */         return "OTHER";
/*      */       case 33384:
/*   73 */         return "MARKER";
/*      */     } 
/*   75 */     return a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   private static String d(int ☃) {
/*   80 */     switch (☃) {
/*      */       case 37190:
/*   82 */         return "HIGH";
/*      */       case 37191:
/*   84 */         return "MEDIUM";
/*      */       case 37192:
/*   86 */         return "LOW";
/*      */       case 33387:
/*   88 */         return "NOTIFICATION";
/*      */     } 
/*   90 */     return a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   private static void a(int ☃, int i, int j, int k, int m, long l1, long l2) {
/*   95 */     d.info("OpenGL debug message, id={}, source={}, type={}, severity={}, message={}", 
/*   96 */         Integer.valueOf(j), 
/*   97 */         b(☃), 
/*   98 */         c(i), 
/*   99 */         d(k), 
/*  100 */         GLDebugMessageCallback.getMessage(m, l1));
/*      */   }
/*      */ 
/*      */   
/*  104 */   protected static final ByteBuffer a = deq.a(64);
/*  105 */   protected static final FloatBuffer b = a.asFloatBuffer();
/*  106 */   protected static final IntBuffer c = a.asIntBuffer();
/*      */   
/*  108 */   private static final Joiner e = Joiner.on('\n');
/*  109 */   private static final Joiner f = Joiner.on("; ");
/*      */   
/*  111 */   private static final Map<Integer, String> g = Maps.newHashMap();
/*      */   
/*  113 */   private static final List<Integer> h = (List<Integer>)ImmutableList.of(Integer.valueOf(37190), Integer.valueOf(37191), Integer.valueOf(37192), Integer.valueOf(33387));
/*  114 */   private static final List<Integer> i = (List<Integer>)ImmutableList.of(Integer.valueOf(37190), Integer.valueOf(37191), Integer.valueOf(37192));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static {
/*  495 */     a(256, "GL11.GL_ACCUM");
/*  496 */     a(257, "GL11.GL_LOAD");
/*  497 */     a(258, "GL11.GL_RETURN");
/*  498 */     a(259, "GL11.GL_MULT");
/*  499 */     a(260, "GL11.GL_ADD");
/*  500 */     a(512, "GL11.GL_NEVER");
/*  501 */     a(513, "GL11.GL_LESS");
/*  502 */     a(514, "GL11.GL_EQUAL");
/*  503 */     a(515, "GL11.GL_LEQUAL");
/*  504 */     a(516, "GL11.GL_GREATER");
/*  505 */     a(517, "GL11.GL_NOTEQUAL");
/*  506 */     a(518, "GL11.GL_GEQUAL");
/*  507 */     a(519, "GL11.GL_ALWAYS");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  529 */     a(0, "GL11.GL_POINTS");
/*  530 */     a(1, "GL11.GL_LINES");
/*  531 */     a(2, "GL11.GL_LINE_LOOP");
/*  532 */     a(3, "GL11.GL_LINE_STRIP");
/*  533 */     a(4, "GL11.GL_TRIANGLES");
/*  534 */     a(5, "GL11.GL_TRIANGLE_STRIP");
/*  535 */     a(6, "GL11.GL_TRIANGLE_FAN");
/*  536 */     a(7, "GL11.GL_QUADS");
/*  537 */     a(8, "GL11.GL_QUAD_STRIP");
/*  538 */     a(9, "GL11.GL_POLYGON");
/*  539 */     a(0, "GL11.GL_ZERO");
/*  540 */     a(1, "GL11.GL_ONE");
/*  541 */     a(768, "GL11.GL_SRC_COLOR");
/*  542 */     a(769, "GL11.GL_ONE_MINUS_SRC_COLOR");
/*  543 */     a(770, "GL11.GL_SRC_ALPHA");
/*  544 */     a(771, "GL11.GL_ONE_MINUS_SRC_ALPHA");
/*  545 */     a(772, "GL11.GL_DST_ALPHA");
/*  546 */     a(773, "GL11.GL_ONE_MINUS_DST_ALPHA");
/*  547 */     a(774, "GL11.GL_DST_COLOR");
/*  548 */     a(775, "GL11.GL_ONE_MINUS_DST_COLOR");
/*  549 */     a(776, "GL11.GL_SRC_ALPHA_SATURATE");
/*  550 */     a(32769, "GL14.GL_CONSTANT_COLOR");
/*  551 */     a(32770, "GL14.GL_ONE_MINUS_CONSTANT_COLOR");
/*  552 */     a(32771, "GL14.GL_CONSTANT_ALPHA");
/*  553 */     a(32772, "GL14.GL_ONE_MINUS_CONSTANT_ALPHA");
/*  554 */     a(1, "GL11.GL_TRUE");
/*  555 */     a(0, "GL11.GL_FALSE");
/*  556 */     a(12288, "GL11.GL_CLIP_PLANE0");
/*  557 */     a(12289, "GL11.GL_CLIP_PLANE1");
/*  558 */     a(12290, "GL11.GL_CLIP_PLANE2");
/*  559 */     a(12291, "GL11.GL_CLIP_PLANE3");
/*  560 */     a(12292, "GL11.GL_CLIP_PLANE4");
/*  561 */     a(12293, "GL11.GL_CLIP_PLANE5");
/*  562 */     a(5120, "GL11.GL_BYTE");
/*  563 */     a(5121, "GL11.GL_UNSIGNED_BYTE");
/*  564 */     a(5122, "GL11.GL_SHORT");
/*  565 */     a(5123, "GL11.GL_UNSIGNED_SHORT");
/*  566 */     a(5124, "GL11.GL_INT");
/*  567 */     a(5125, "GL11.GL_UNSIGNED_INT");
/*  568 */     a(5126, "GL11.GL_FLOAT");
/*  569 */     a(5127, "GL11.GL_2_BYTES");
/*  570 */     a(5128, "GL11.GL_3_BYTES");
/*  571 */     a(5129, "GL11.GL_4_BYTES");
/*  572 */     a(5130, "GL11.GL_DOUBLE");
/*  573 */     a(0, "GL11.GL_NONE");
/*  574 */     a(1024, "GL11.GL_FRONT_LEFT");
/*  575 */     a(1025, "GL11.GL_FRONT_RIGHT");
/*  576 */     a(1026, "GL11.GL_BACK_LEFT");
/*  577 */     a(1027, "GL11.GL_BACK_RIGHT");
/*  578 */     a(1028, "GL11.GL_FRONT");
/*  579 */     a(1029, "GL11.GL_BACK");
/*  580 */     a(1030, "GL11.GL_LEFT");
/*  581 */     a(1031, "GL11.GL_RIGHT");
/*  582 */     a(1032, "GL11.GL_FRONT_AND_BACK");
/*  583 */     a(1033, "GL11.GL_AUX0");
/*  584 */     a(1034, "GL11.GL_AUX1");
/*  585 */     a(1035, "GL11.GL_AUX2");
/*  586 */     a(1036, "GL11.GL_AUX3");
/*  587 */     a(0, "GL11.GL_NO_ERROR");
/*  588 */     a(1280, "GL11.GL_INVALID_ENUM");
/*  589 */     a(1281, "GL11.GL_INVALID_VALUE");
/*  590 */     a(1282, "GL11.GL_INVALID_OPERATION");
/*  591 */     a(1283, "GL11.GL_STACK_OVERFLOW");
/*  592 */     a(1284, "GL11.GL_STACK_UNDERFLOW");
/*  593 */     a(1285, "GL11.GL_OUT_OF_MEMORY");
/*  594 */     a(1536, "GL11.GL_2D");
/*  595 */     a(1537, "GL11.GL_3D");
/*  596 */     a(1538, "GL11.GL_3D_COLOR");
/*  597 */     a(1539, "GL11.GL_3D_COLOR_TEXTURE");
/*  598 */     a(1540, "GL11.GL_4D_COLOR_TEXTURE");
/*  599 */     a(1792, "GL11.GL_PASS_THROUGH_TOKEN");
/*  600 */     a(1793, "GL11.GL_POINT_TOKEN");
/*  601 */     a(1794, "GL11.GL_LINE_TOKEN");
/*  602 */     a(1795, "GL11.GL_POLYGON_TOKEN");
/*  603 */     a(1796, "GL11.GL_BITMAP_TOKEN");
/*  604 */     a(1797, "GL11.GL_DRAW_PIXEL_TOKEN");
/*  605 */     a(1798, "GL11.GL_COPY_PIXEL_TOKEN");
/*  606 */     a(1799, "GL11.GL_LINE_RESET_TOKEN");
/*  607 */     a(2048, "GL11.GL_EXP");
/*  608 */     a(2049, "GL11.GL_EXP2");
/*  609 */     a(2304, "GL11.GL_CW");
/*  610 */     a(2305, "GL11.GL_CCW");
/*  611 */     a(2560, "GL11.GL_COEFF");
/*  612 */     a(2561, "GL11.GL_ORDER");
/*  613 */     a(2562, "GL11.GL_DOMAIN");
/*  614 */     a(2816, "GL11.GL_CURRENT_COLOR");
/*  615 */     a(2817, "GL11.GL_CURRENT_INDEX");
/*  616 */     a(2818, "GL11.GL_CURRENT_NORMAL");
/*  617 */     a(2819, "GL11.GL_CURRENT_TEXTURE_COORDS");
/*  618 */     a(2820, "GL11.GL_CURRENT_RASTER_COLOR");
/*  619 */     a(2821, "GL11.GL_CURRENT_RASTER_INDEX");
/*  620 */     a(2822, "GL11.GL_CURRENT_RASTER_TEXTURE_COORDS");
/*  621 */     a(2823, "GL11.GL_CURRENT_RASTER_POSITION");
/*  622 */     a(2824, "GL11.GL_CURRENT_RASTER_POSITION_VALID");
/*  623 */     a(2825, "GL11.GL_CURRENT_RASTER_DISTANCE");
/*  624 */     a(2832, "GL11.GL_POINT_SMOOTH");
/*  625 */     a(2833, "GL11.GL_POINT_SIZE");
/*  626 */     a(2834, "GL11.GL_POINT_SIZE_RANGE");
/*  627 */     a(2835, "GL11.GL_POINT_SIZE_GRANULARITY");
/*  628 */     a(2848, "GL11.GL_LINE_SMOOTH");
/*  629 */     a(2849, "GL11.GL_LINE_WIDTH");
/*  630 */     a(2850, "GL11.GL_LINE_WIDTH_RANGE");
/*  631 */     a(2851, "GL11.GL_LINE_WIDTH_GRANULARITY");
/*  632 */     a(2852, "GL11.GL_LINE_STIPPLE");
/*  633 */     a(2853, "GL11.GL_LINE_STIPPLE_PATTERN");
/*  634 */     a(2854, "GL11.GL_LINE_STIPPLE_REPEAT");
/*  635 */     a(2864, "GL11.GL_LIST_MODE");
/*  636 */     a(2865, "GL11.GL_MAX_LIST_NESTING");
/*  637 */     a(2866, "GL11.GL_LIST_BASE");
/*  638 */     a(2867, "GL11.GL_LIST_INDEX");
/*  639 */     a(2880, "GL11.GL_POLYGON_MODE");
/*  640 */     a(2881, "GL11.GL_POLYGON_SMOOTH");
/*  641 */     a(2882, "GL11.GL_POLYGON_STIPPLE");
/*  642 */     a(2883, "GL11.GL_EDGE_FLAG");
/*  643 */     a(2884, "GL11.GL_CULL_FACE");
/*  644 */     a(2885, "GL11.GL_CULL_FACE_MODE");
/*  645 */     a(2886, "GL11.GL_FRONT_FACE");
/*  646 */     a(2896, "GL11.GL_LIGHTING");
/*  647 */     a(2897, "GL11.GL_LIGHT_MODEL_LOCAL_VIEWER");
/*  648 */     a(2898, "GL11.GL_LIGHT_MODEL_TWO_SIDE");
/*  649 */     a(2899, "GL11.GL_LIGHT_MODEL_AMBIENT");
/*  650 */     a(2900, "GL11.GL_SHADE_MODEL");
/*  651 */     a(2901, "GL11.GL_COLOR_MATERIAL_FACE");
/*  652 */     a(2902, "GL11.GL_COLOR_MATERIAL_PARAMETER");
/*  653 */     a(2903, "GL11.GL_COLOR_MATERIAL");
/*  654 */     a(2912, "GL11.GL_FOG");
/*  655 */     a(2913, "GL11.GL_FOG_INDEX");
/*  656 */     a(2914, "GL11.GL_FOG_DENSITY");
/*  657 */     a(2915, "GL11.GL_FOG_START");
/*  658 */     a(2916, "GL11.GL_FOG_END");
/*  659 */     a(2917, "GL11.GL_FOG_MODE");
/*  660 */     a(2918, "GL11.GL_FOG_COLOR");
/*  661 */     a(2928, "GL11.GL_DEPTH_RANGE");
/*  662 */     a(2929, "GL11.GL_DEPTH_TEST");
/*  663 */     a(2930, "GL11.GL_DEPTH_WRITEMASK");
/*  664 */     a(2931, "GL11.GL_DEPTH_CLEAR_VALUE");
/*  665 */     a(2932, "GL11.GL_DEPTH_FUNC");
/*  666 */     a(2944, "GL11.GL_ACCUM_CLEAR_VALUE");
/*  667 */     a(2960, "GL11.GL_STENCIL_TEST");
/*  668 */     a(2961, "GL11.GL_STENCIL_CLEAR_VALUE");
/*  669 */     a(2962, "GL11.GL_STENCIL_FUNC");
/*  670 */     a(2963, "GL11.GL_STENCIL_VALUE_MASK");
/*  671 */     a(2964, "GL11.GL_STENCIL_FAIL");
/*  672 */     a(2965, "GL11.GL_STENCIL_PASS_DEPTH_FAIL");
/*  673 */     a(2966, "GL11.GL_STENCIL_PASS_DEPTH_PASS");
/*  674 */     a(2967, "GL11.GL_STENCIL_REF");
/*  675 */     a(2968, "GL11.GL_STENCIL_WRITEMASK");
/*  676 */     a(2976, "GL11.GL_MATRIX_MODE");
/*  677 */     a(2977, "GL11.GL_NORMALIZE");
/*  678 */     a(2978, "GL11.GL_VIEWPORT");
/*  679 */     a(2979, "GL11.GL_MODELVIEW_STACK_DEPTH");
/*  680 */     a(2980, "GL11.GL_PROJECTION_STACK_DEPTH");
/*  681 */     a(2981, "GL11.GL_TEXTURE_STACK_DEPTH");
/*  682 */     a(2982, "GL11.GL_MODELVIEW_MATRIX");
/*  683 */     a(2983, "GL11.GL_PROJECTION_MATRIX");
/*  684 */     a(2984, "GL11.GL_TEXTURE_MATRIX");
/*  685 */     a(2992, "GL11.GL_ATTRIB_STACK_DEPTH");
/*  686 */     a(2993, "GL11.GL_CLIENT_ATTRIB_STACK_DEPTH");
/*  687 */     a(3008, "GL11.GL_ALPHA_TEST");
/*  688 */     a(3009, "GL11.GL_ALPHA_TEST_FUNC");
/*  689 */     a(3010, "GL11.GL_ALPHA_TEST_REF");
/*  690 */     a(3024, "GL11.GL_DITHER");
/*  691 */     a(3040, "GL11.GL_BLEND_DST");
/*  692 */     a(3041, "GL11.GL_BLEND_SRC");
/*  693 */     a(3042, "GL11.GL_BLEND");
/*  694 */     a(3056, "GL11.GL_LOGIC_OP_MODE");
/*  695 */     a(3057, "GL11.GL_INDEX_LOGIC_OP");
/*  696 */     a(3058, "GL11.GL_COLOR_LOGIC_OP");
/*  697 */     a(3072, "GL11.GL_AUX_BUFFERS");
/*  698 */     a(3073, "GL11.GL_DRAW_BUFFER");
/*  699 */     a(3074, "GL11.GL_READ_BUFFER");
/*  700 */     a(3088, "GL11.GL_SCISSOR_BOX");
/*  701 */     a(3089, "GL11.GL_SCISSOR_TEST");
/*  702 */     a(3104, "GL11.GL_INDEX_CLEAR_VALUE");
/*  703 */     a(3105, "GL11.GL_INDEX_WRITEMASK");
/*  704 */     a(3106, "GL11.GL_COLOR_CLEAR_VALUE");
/*  705 */     a(3107, "GL11.GL_COLOR_WRITEMASK");
/*  706 */     a(3120, "GL11.GL_INDEX_MODE");
/*  707 */     a(3121, "GL11.GL_RGBA_MODE");
/*  708 */     a(3122, "GL11.GL_DOUBLEBUFFER");
/*  709 */     a(3123, "GL11.GL_STEREO");
/*  710 */     a(3136, "GL11.GL_RENDER_MODE");
/*  711 */     a(3152, "GL11.GL_PERSPECTIVE_CORRECTION_HINT");
/*  712 */     a(3153, "GL11.GL_POINT_SMOOTH_HINT");
/*  713 */     a(3154, "GL11.GL_LINE_SMOOTH_HINT");
/*  714 */     a(3155, "GL11.GL_POLYGON_SMOOTH_HINT");
/*  715 */     a(3156, "GL11.GL_FOG_HINT");
/*  716 */     a(3168, "GL11.GL_TEXTURE_GEN_S");
/*  717 */     a(3169, "GL11.GL_TEXTURE_GEN_T");
/*  718 */     a(3170, "GL11.GL_TEXTURE_GEN_R");
/*  719 */     a(3171, "GL11.GL_TEXTURE_GEN_Q");
/*  720 */     a(3184, "GL11.GL_PIXEL_MAP_I_TO_I");
/*  721 */     a(3185, "GL11.GL_PIXEL_MAP_S_TO_S");
/*  722 */     a(3186, "GL11.GL_PIXEL_MAP_I_TO_R");
/*  723 */     a(3187, "GL11.GL_PIXEL_MAP_I_TO_G");
/*  724 */     a(3188, "GL11.GL_PIXEL_MAP_I_TO_B");
/*  725 */     a(3189, "GL11.GL_PIXEL_MAP_I_TO_A");
/*  726 */     a(3190, "GL11.GL_PIXEL_MAP_R_TO_R");
/*  727 */     a(3191, "GL11.GL_PIXEL_MAP_G_TO_G");
/*  728 */     a(3192, "GL11.GL_PIXEL_MAP_B_TO_B");
/*  729 */     a(3193, "GL11.GL_PIXEL_MAP_A_TO_A");
/*  730 */     a(3248, "GL11.GL_PIXEL_MAP_I_TO_I_SIZE");
/*  731 */     a(3249, "GL11.GL_PIXEL_MAP_S_TO_S_SIZE");
/*  732 */     a(3250, "GL11.GL_PIXEL_MAP_I_TO_R_SIZE");
/*  733 */     a(3251, "GL11.GL_PIXEL_MAP_I_TO_G_SIZE");
/*  734 */     a(3252, "GL11.GL_PIXEL_MAP_I_TO_B_SIZE");
/*  735 */     a(3253, "GL11.GL_PIXEL_MAP_I_TO_A_SIZE");
/*  736 */     a(3254, "GL11.GL_PIXEL_MAP_R_TO_R_SIZE");
/*  737 */     a(3255, "GL11.GL_PIXEL_MAP_G_TO_G_SIZE");
/*  738 */     a(3256, "GL11.GL_PIXEL_MAP_B_TO_B_SIZE");
/*  739 */     a(3257, "GL11.GL_PIXEL_MAP_A_TO_A_SIZE");
/*  740 */     a(3312, "GL11.GL_UNPACK_SWAP_BYTES");
/*  741 */     a(3313, "GL11.GL_UNPACK_LSB_FIRST");
/*  742 */     a(3314, "GL11.GL_UNPACK_ROW_LENGTH");
/*  743 */     a(3315, "GL11.GL_UNPACK_SKIP_ROWS");
/*  744 */     a(3316, "GL11.GL_UNPACK_SKIP_PIXELS");
/*  745 */     a(3317, "GL11.GL_UNPACK_ALIGNMENT");
/*  746 */     a(3328, "GL11.GL_PACK_SWAP_BYTES");
/*  747 */     a(3329, "GL11.GL_PACK_LSB_FIRST");
/*  748 */     a(3330, "GL11.GL_PACK_ROW_LENGTH");
/*  749 */     a(3331, "GL11.GL_PACK_SKIP_ROWS");
/*  750 */     a(3332, "GL11.GL_PACK_SKIP_PIXELS");
/*  751 */     a(3333, "GL11.GL_PACK_ALIGNMENT");
/*  752 */     a(3344, "GL11.GL_MAP_COLOR");
/*  753 */     a(3345, "GL11.GL_MAP_STENCIL");
/*  754 */     a(3346, "GL11.GL_INDEX_SHIFT");
/*  755 */     a(3347, "GL11.GL_INDEX_OFFSET");
/*  756 */     a(3348, "GL11.GL_RED_SCALE");
/*  757 */     a(3349, "GL11.GL_RED_BIAS");
/*  758 */     a(3350, "GL11.GL_ZOOM_X");
/*  759 */     a(3351, "GL11.GL_ZOOM_Y");
/*  760 */     a(3352, "GL11.GL_GREEN_SCALE");
/*  761 */     a(3353, "GL11.GL_GREEN_BIAS");
/*  762 */     a(3354, "GL11.GL_BLUE_SCALE");
/*  763 */     a(3355, "GL11.GL_BLUE_BIAS");
/*  764 */     a(3356, "GL11.GL_ALPHA_SCALE");
/*  765 */     a(3357, "GL11.GL_ALPHA_BIAS");
/*  766 */     a(3358, "GL11.GL_DEPTH_SCALE");
/*  767 */     a(3359, "GL11.GL_DEPTH_BIAS");
/*  768 */     a(3376, "GL11.GL_MAX_EVAL_ORDER");
/*  769 */     a(3377, "GL11.GL_MAX_LIGHTS");
/*  770 */     a(3378, "GL11.GL_MAX_CLIP_PLANES");
/*  771 */     a(3379, "GL11.GL_MAX_TEXTURE_SIZE");
/*  772 */     a(3380, "GL11.GL_MAX_PIXEL_MAP_TABLE");
/*  773 */     a(3381, "GL11.GL_MAX_ATTRIB_STACK_DEPTH");
/*  774 */     a(3382, "GL11.GL_MAX_MODELVIEW_STACK_DEPTH");
/*  775 */     a(3383, "GL11.GL_MAX_NAME_STACK_DEPTH");
/*  776 */     a(3384, "GL11.GL_MAX_PROJECTION_STACK_DEPTH");
/*  777 */     a(3385, "GL11.GL_MAX_TEXTURE_STACK_DEPTH");
/*  778 */     a(3386, "GL11.GL_MAX_VIEWPORT_DIMS");
/*  779 */     a(3387, "GL11.GL_MAX_CLIENT_ATTRIB_STACK_DEPTH");
/*  780 */     a(3408, "GL11.GL_SUBPIXEL_BITS");
/*  781 */     a(3409, "GL11.GL_INDEX_BITS");
/*  782 */     a(3410, "GL11.GL_RED_BITS");
/*  783 */     a(3411, "GL11.GL_GREEN_BITS");
/*  784 */     a(3412, "GL11.GL_BLUE_BITS");
/*  785 */     a(3413, "GL11.GL_ALPHA_BITS");
/*  786 */     a(3414, "GL11.GL_DEPTH_BITS");
/*  787 */     a(3415, "GL11.GL_STENCIL_BITS");
/*  788 */     a(3416, "GL11.GL_ACCUM_RED_BITS");
/*  789 */     a(3417, "GL11.GL_ACCUM_GREEN_BITS");
/*  790 */     a(3418, "GL11.GL_ACCUM_BLUE_BITS");
/*  791 */     a(3419, "GL11.GL_ACCUM_ALPHA_BITS");
/*  792 */     a(3440, "GL11.GL_NAME_STACK_DEPTH");
/*  793 */     a(3456, "GL11.GL_AUTO_NORMAL");
/*  794 */     a(3472, "GL11.GL_MAP1_COLOR_4");
/*  795 */     a(3473, "GL11.GL_MAP1_INDEX");
/*  796 */     a(3474, "GL11.GL_MAP1_NORMAL");
/*  797 */     a(3475, "GL11.GL_MAP1_TEXTURE_COORD_1");
/*  798 */     a(3476, "GL11.GL_MAP1_TEXTURE_COORD_2");
/*  799 */     a(3477, "GL11.GL_MAP1_TEXTURE_COORD_3");
/*  800 */     a(3478, "GL11.GL_MAP1_TEXTURE_COORD_4");
/*  801 */     a(3479, "GL11.GL_MAP1_VERTEX_3");
/*  802 */     a(3480, "GL11.GL_MAP1_VERTEX_4");
/*  803 */     a(3504, "GL11.GL_MAP2_COLOR_4");
/*  804 */     a(3505, "GL11.GL_MAP2_INDEX");
/*  805 */     a(3506, "GL11.GL_MAP2_NORMAL");
/*  806 */     a(3507, "GL11.GL_MAP2_TEXTURE_COORD_1");
/*  807 */     a(3508, "GL11.GL_MAP2_TEXTURE_COORD_2");
/*  808 */     a(3509, "GL11.GL_MAP2_TEXTURE_COORD_3");
/*  809 */     a(3510, "GL11.GL_MAP2_TEXTURE_COORD_4");
/*  810 */     a(3511, "GL11.GL_MAP2_VERTEX_3");
/*  811 */     a(3512, "GL11.GL_MAP2_VERTEX_4");
/*  812 */     a(3536, "GL11.GL_MAP1_GRID_DOMAIN");
/*  813 */     a(3537, "GL11.GL_MAP1_GRID_SEGMENTS");
/*  814 */     a(3538, "GL11.GL_MAP2_GRID_DOMAIN");
/*  815 */     a(3539, "GL11.GL_MAP2_GRID_SEGMENTS");
/*  816 */     a(3552, "GL11.GL_TEXTURE_1D");
/*  817 */     a(3553, "GL11.GL_TEXTURE_2D");
/*  818 */     a(3568, "GL11.GL_FEEDBACK_BUFFER_POINTER");
/*  819 */     a(3569, "GL11.GL_FEEDBACK_BUFFER_SIZE");
/*  820 */     a(3570, "GL11.GL_FEEDBACK_BUFFER_TYPE");
/*  821 */     a(3571, "GL11.GL_SELECTION_BUFFER_POINTER");
/*  822 */     a(3572, "GL11.GL_SELECTION_BUFFER_SIZE");
/*  823 */     a(4096, "GL11.GL_TEXTURE_WIDTH");
/*  824 */     a(4097, "GL11.GL_TEXTURE_HEIGHT");
/*  825 */     a(4099, "GL11.GL_TEXTURE_INTERNAL_FORMAT");
/*  826 */     a(4100, "GL11.GL_TEXTURE_BORDER_COLOR");
/*  827 */     a(4101, "GL11.GL_TEXTURE_BORDER");
/*  828 */     a(4352, "GL11.GL_DONT_CARE");
/*  829 */     a(4353, "GL11.GL_FASTEST");
/*  830 */     a(4354, "GL11.GL_NICEST");
/*  831 */     a(16384, "GL11.GL_LIGHT0");
/*  832 */     a(16385, "GL11.GL_LIGHT1");
/*  833 */     a(16386, "GL11.GL_LIGHT2");
/*  834 */     a(16387, "GL11.GL_LIGHT3");
/*  835 */     a(16388, "GL11.GL_LIGHT4");
/*  836 */     a(16389, "GL11.GL_LIGHT5");
/*  837 */     a(16390, "GL11.GL_LIGHT6");
/*  838 */     a(16391, "GL11.GL_LIGHT7");
/*  839 */     a(4608, "GL11.GL_AMBIENT");
/*  840 */     a(4609, "GL11.GL_DIFFUSE");
/*  841 */     a(4610, "GL11.GL_SPECULAR");
/*  842 */     a(4611, "GL11.GL_POSITION");
/*  843 */     a(4612, "GL11.GL_SPOT_DIRECTION");
/*  844 */     a(4613, "GL11.GL_SPOT_EXPONENT");
/*  845 */     a(4614, "GL11.GL_SPOT_CUTOFF");
/*  846 */     a(4615, "GL11.GL_CONSTANT_ATTENUATION");
/*  847 */     a(4616, "GL11.GL_LINEAR_ATTENUATION");
/*  848 */     a(4617, "GL11.GL_QUADRATIC_ATTENUATION");
/*  849 */     a(4864, "GL11.GL_COMPILE");
/*  850 */     a(4865, "GL11.GL_COMPILE_AND_EXECUTE");
/*  851 */     a(5376, "GL11.GL_CLEAR");
/*  852 */     a(5377, "GL11.GL_AND");
/*  853 */     a(5378, "GL11.GL_AND_REVERSE");
/*  854 */     a(5379, "GL11.GL_COPY");
/*  855 */     a(5380, "GL11.GL_AND_INVERTED");
/*  856 */     a(5381, "GL11.GL_NOOP");
/*  857 */     a(5382, "GL11.GL_XOR");
/*  858 */     a(5383, "GL11.GL_OR");
/*  859 */     a(5384, "GL11.GL_NOR");
/*  860 */     a(5385, "GL11.GL_EQUIV");
/*  861 */     a(5386, "GL11.GL_INVERT");
/*  862 */     a(5387, "GL11.GL_OR_REVERSE");
/*  863 */     a(5388, "GL11.GL_COPY_INVERTED");
/*  864 */     a(5389, "GL11.GL_OR_INVERTED");
/*  865 */     a(5390, "GL11.GL_NAND");
/*  866 */     a(5391, "GL11.GL_SET");
/*  867 */     a(5632, "GL11.GL_EMISSION");
/*  868 */     a(5633, "GL11.GL_SHININESS");
/*  869 */     a(5634, "GL11.GL_AMBIENT_AND_DIFFUSE");
/*  870 */     a(5635, "GL11.GL_COLOR_INDEXES");
/*  871 */     a(5888, "GL11.GL_MODELVIEW");
/*  872 */     a(5889, "GL11.GL_PROJECTION");
/*  873 */     a(5890, "GL11.GL_TEXTURE");
/*  874 */     a(6144, "GL11.GL_COLOR");
/*  875 */     a(6145, "GL11.GL_DEPTH");
/*  876 */     a(6146, "GL11.GL_STENCIL");
/*  877 */     a(6400, "GL11.GL_COLOR_INDEX");
/*  878 */     a(6401, "GL11.GL_STENCIL_INDEX");
/*  879 */     a(6402, "GL11.GL_DEPTH_COMPONENT");
/*  880 */     a(6403, "GL11.GL_RED");
/*  881 */     a(6404, "GL11.GL_GREEN");
/*  882 */     a(6405, "GL11.GL_BLUE");
/*  883 */     a(6406, "GL11.GL_ALPHA");
/*  884 */     a(6407, "GL11.GL_RGB");
/*  885 */     a(6408, "GL11.GL_RGBA");
/*  886 */     a(6409, "GL11.GL_LUMINANCE");
/*  887 */     a(6410, "GL11.GL_LUMINANCE_ALPHA");
/*  888 */     a(6656, "GL11.GL_BITMAP");
/*  889 */     a(6912, "GL11.GL_POINT");
/*  890 */     a(6913, "GL11.GL_LINE");
/*  891 */     a(6914, "GL11.GL_FILL");
/*  892 */     a(7168, "GL11.GL_RENDER");
/*  893 */     a(7169, "GL11.GL_FEEDBACK");
/*  894 */     a(7170, "GL11.GL_SELECT");
/*  895 */     a(7424, "GL11.GL_FLAT");
/*  896 */     a(7425, "GL11.GL_SMOOTH");
/*  897 */     a(7680, "GL11.GL_KEEP");
/*  898 */     a(7681, "GL11.GL_REPLACE");
/*  899 */     a(7682, "GL11.GL_INCR");
/*  900 */     a(7683, "GL11.GL_DECR");
/*  901 */     a(7936, "GL11.GL_VENDOR");
/*  902 */     a(7937, "GL11.GL_RENDERER");
/*  903 */     a(7938, "GL11.GL_VERSION");
/*  904 */     a(7939, "GL11.GL_EXTENSIONS");
/*  905 */     a(8192, "GL11.GL_S");
/*  906 */     a(8193, "GL11.GL_T");
/*  907 */     a(8194, "GL11.GL_R");
/*  908 */     a(8195, "GL11.GL_Q");
/*  909 */     a(8448, "GL11.GL_MODULATE");
/*  910 */     a(8449, "GL11.GL_DECAL");
/*  911 */     a(8704, "GL11.GL_TEXTURE_ENV_MODE");
/*  912 */     a(8705, "GL11.GL_TEXTURE_ENV_COLOR");
/*  913 */     a(8960, "GL11.GL_TEXTURE_ENV");
/*  914 */     a(9216, "GL11.GL_EYE_LINEAR");
/*  915 */     a(9217, "GL11.GL_OBJECT_LINEAR");
/*  916 */     a(9218, "GL11.GL_SPHERE_MAP");
/*  917 */     a(9472, "GL11.GL_TEXTURE_GEN_MODE");
/*  918 */     a(9473, "GL11.GL_OBJECT_PLANE");
/*  919 */     a(9474, "GL11.GL_EYE_PLANE");
/*  920 */     a(9728, "GL11.GL_NEAREST");
/*  921 */     a(9729, "GL11.GL_LINEAR");
/*  922 */     a(9984, "GL11.GL_NEAREST_MIPMAP_NEAREST");
/*  923 */     a(9985, "GL11.GL_LINEAR_MIPMAP_NEAREST");
/*  924 */     a(9986, "GL11.GL_NEAREST_MIPMAP_LINEAR");
/*  925 */     a(9987, "GL11.GL_LINEAR_MIPMAP_LINEAR");
/*  926 */     a(10240, "GL11.GL_TEXTURE_MAG_FILTER");
/*  927 */     a(10241, "GL11.GL_TEXTURE_MIN_FILTER");
/*  928 */     a(10242, "GL11.GL_TEXTURE_WRAP_S");
/*  929 */     a(10243, "GL11.GL_TEXTURE_WRAP_T");
/*  930 */     a(10496, "GL11.GL_CLAMP");
/*  931 */     a(10497, "GL11.GL_REPEAT");
/*      */ 
/*      */ 
/*      */     
/*  935 */     a(-1, "GL11.GL_ALL_CLIENT_ATTRIB_BITS");
/*  936 */     a(32824, "GL11.GL_POLYGON_OFFSET_FACTOR");
/*  937 */     a(10752, "GL11.GL_POLYGON_OFFSET_UNITS");
/*  938 */     a(10753, "GL11.GL_POLYGON_OFFSET_POINT");
/*  939 */     a(10754, "GL11.GL_POLYGON_OFFSET_LINE");
/*  940 */     a(32823, "GL11.GL_POLYGON_OFFSET_FILL");
/*  941 */     a(32827, "GL11.GL_ALPHA4");
/*  942 */     a(32828, "GL11.GL_ALPHA8");
/*  943 */     a(32829, "GL11.GL_ALPHA12");
/*  944 */     a(32830, "GL11.GL_ALPHA16");
/*  945 */     a(32831, "GL11.GL_LUMINANCE4");
/*  946 */     a(32832, "GL11.GL_LUMINANCE8");
/*  947 */     a(32833, "GL11.GL_LUMINANCE12");
/*  948 */     a(32834, "GL11.GL_LUMINANCE16");
/*  949 */     a(32835, "GL11.GL_LUMINANCE4_ALPHA4");
/*  950 */     a(32836, "GL11.GL_LUMINANCE6_ALPHA2");
/*  951 */     a(32837, "GL11.GL_LUMINANCE8_ALPHA8");
/*  952 */     a(32838, "GL11.GL_LUMINANCE12_ALPHA4");
/*  953 */     a(32839, "GL11.GL_LUMINANCE12_ALPHA12");
/*  954 */     a(32840, "GL11.GL_LUMINANCE16_ALPHA16");
/*  955 */     a(32841, "GL11.GL_INTENSITY");
/*  956 */     a(32842, "GL11.GL_INTENSITY4");
/*  957 */     a(32843, "GL11.GL_INTENSITY8");
/*  958 */     a(32844, "GL11.GL_INTENSITY12");
/*  959 */     a(32845, "GL11.GL_INTENSITY16");
/*  960 */     a(10768, "GL11.GL_R3_G3_B2");
/*  961 */     a(32847, "GL11.GL_RGB4");
/*  962 */     a(32848, "GL11.GL_RGB5");
/*  963 */     a(32849, "GL11.GL_RGB8");
/*  964 */     a(32850, "GL11.GL_RGB10");
/*  965 */     a(32851, "GL11.GL_RGB12");
/*  966 */     a(32852, "GL11.GL_RGB16");
/*  967 */     a(32853, "GL11.GL_RGBA2");
/*  968 */     a(32854, "GL11.GL_RGBA4");
/*  969 */     a(32855, "GL11.GL_RGB5_A1");
/*  970 */     a(32856, "GL11.GL_RGBA8");
/*  971 */     a(32857, "GL11.GL_RGB10_A2");
/*  972 */     a(32858, "GL11.GL_RGBA12");
/*  973 */     a(32859, "GL11.GL_RGBA16");
/*  974 */     a(32860, "GL11.GL_TEXTURE_RED_SIZE");
/*  975 */     a(32861, "GL11.GL_TEXTURE_GREEN_SIZE");
/*  976 */     a(32862, "GL11.GL_TEXTURE_BLUE_SIZE");
/*  977 */     a(32863, "GL11.GL_TEXTURE_ALPHA_SIZE");
/*  978 */     a(32864, "GL11.GL_TEXTURE_LUMINANCE_SIZE");
/*  979 */     a(32865, "GL11.GL_TEXTURE_INTENSITY_SIZE");
/*  980 */     a(32867, "GL11.GL_PROXY_TEXTURE_1D");
/*  981 */     a(32868, "GL11.GL_PROXY_TEXTURE_2D");
/*  982 */     a(32870, "GL11.GL_TEXTURE_PRIORITY");
/*  983 */     a(32871, "GL11.GL_TEXTURE_RESIDENT");
/*  984 */     a(32872, "GL11.GL_TEXTURE_BINDING_1D");
/*  985 */     a(32873, "GL11.GL_TEXTURE_BINDING_2D");
/*  986 */     a(32884, "GL11.GL_VERTEX_ARRAY");
/*  987 */     a(32885, "GL11.GL_NORMAL_ARRAY");
/*  988 */     a(32886, "GL11.GL_COLOR_ARRAY");
/*  989 */     a(32887, "GL11.GL_INDEX_ARRAY");
/*  990 */     a(32888, "GL11.GL_TEXTURE_COORD_ARRAY");
/*  991 */     a(32889, "GL11.GL_EDGE_FLAG_ARRAY");
/*  992 */     a(32890, "GL11.GL_VERTEX_ARRAY_SIZE");
/*  993 */     a(32891, "GL11.GL_VERTEX_ARRAY_TYPE");
/*  994 */     a(32892, "GL11.GL_VERTEX_ARRAY_STRIDE");
/*  995 */     a(32894, "GL11.GL_NORMAL_ARRAY_TYPE");
/*  996 */     a(32895, "GL11.GL_NORMAL_ARRAY_STRIDE");
/*  997 */     a(32897, "GL11.GL_COLOR_ARRAY_SIZE");
/*  998 */     a(32898, "GL11.GL_COLOR_ARRAY_TYPE");
/*  999 */     a(32899, "GL11.GL_COLOR_ARRAY_STRIDE");
/* 1000 */     a(32901, "GL11.GL_INDEX_ARRAY_TYPE");
/* 1001 */     a(32902, "GL11.GL_INDEX_ARRAY_STRIDE");
/* 1002 */     a(32904, "GL11.GL_TEXTURE_COORD_ARRAY_SIZE");
/* 1003 */     a(32905, "GL11.GL_TEXTURE_COORD_ARRAY_TYPE");
/* 1004 */     a(32906, "GL11.GL_TEXTURE_COORD_ARRAY_STRIDE");
/* 1005 */     a(32908, "GL11.GL_EDGE_FLAG_ARRAY_STRIDE");
/* 1006 */     a(32910, "GL11.GL_VERTEX_ARRAY_POINTER");
/* 1007 */     a(32911, "GL11.GL_NORMAL_ARRAY_POINTER");
/* 1008 */     a(32912, "GL11.GL_COLOR_ARRAY_POINTER");
/* 1009 */     a(32913, "GL11.GL_INDEX_ARRAY_POINTER");
/* 1010 */     a(32914, "GL11.GL_TEXTURE_COORD_ARRAY_POINTER");
/* 1011 */     a(32915, "GL11.GL_EDGE_FLAG_ARRAY_POINTER");
/* 1012 */     a(10784, "GL11.GL_V2F");
/* 1013 */     a(10785, "GL11.GL_V3F");
/* 1014 */     a(10786, "GL11.GL_C4UB_V2F");
/* 1015 */     a(10787, "GL11.GL_C4UB_V3F");
/* 1016 */     a(10788, "GL11.GL_C3F_V3F");
/* 1017 */     a(10789, "GL11.GL_N3F_V3F");
/* 1018 */     a(10790, "GL11.GL_C4F_N3F_V3F");
/* 1019 */     a(10791, "GL11.GL_T2F_V3F");
/* 1020 */     a(10792, "GL11.GL_T4F_V4F");
/* 1021 */     a(10793, "GL11.GL_T2F_C4UB_V3F");
/* 1022 */     a(10794, "GL11.GL_T2F_C3F_V3F");
/* 1023 */     a(10795, "GL11.GL_T2F_N3F_V3F");
/* 1024 */     a(10796, "GL11.GL_T2F_C4F_N3F_V3F");
/* 1025 */     a(10797, "GL11.GL_T4F_C4F_N3F_V4F");
/* 1026 */     a(3057, "GL11.GL_LOGIC_OP");
/* 1027 */     a(4099, "GL11.GL_TEXTURE_COMPONENTS");
/*      */     
/* 1029 */     a(32874, "GL12.GL_TEXTURE_BINDING_3D");
/* 1030 */     a(32875, "GL12.GL_PACK_SKIP_IMAGES");
/* 1031 */     a(32876, "GL12.GL_PACK_IMAGE_HEIGHT");
/* 1032 */     a(32877, "GL12.GL_UNPACK_SKIP_IMAGES");
/* 1033 */     a(32878, "GL12.GL_UNPACK_IMAGE_HEIGHT");
/* 1034 */     a(32879, "GL12.GL_TEXTURE_3D");
/* 1035 */     a(32880, "GL12.GL_PROXY_TEXTURE_3D");
/* 1036 */     a(32881, "GL12.GL_TEXTURE_DEPTH");
/* 1037 */     a(32882, "GL12.GL_TEXTURE_WRAP_R");
/* 1038 */     a(32883, "GL12.GL_MAX_3D_TEXTURE_SIZE");
/* 1039 */     a(32992, "GL12.GL_BGR");
/* 1040 */     a(32993, "GL12.GL_BGRA");
/* 1041 */     a(32818, "GL12.GL_UNSIGNED_BYTE_3_3_2");
/* 1042 */     a(33634, "GL12.GL_UNSIGNED_BYTE_2_3_3_REV");
/* 1043 */     a(33635, "GL12.GL_UNSIGNED_SHORT_5_6_5");
/* 1044 */     a(33636, "GL12.GL_UNSIGNED_SHORT_5_6_5_REV");
/* 1045 */     a(32819, "GL12.GL_UNSIGNED_SHORT_4_4_4_4");
/* 1046 */     a(33637, "GL12.GL_UNSIGNED_SHORT_4_4_4_4_REV");
/* 1047 */     a(32820, "GL12.GL_UNSIGNED_SHORT_5_5_5_1");
/* 1048 */     a(33638, "GL12.GL_UNSIGNED_SHORT_1_5_5_5_REV");
/* 1049 */     a(32821, "GL12.GL_UNSIGNED_INT_8_8_8_8");
/* 1050 */     a(33639, "GL12.GL_UNSIGNED_INT_8_8_8_8_REV");
/* 1051 */     a(32822, "GL12.GL_UNSIGNED_INT_10_10_10_2");
/* 1052 */     a(33640, "GL12.GL_UNSIGNED_INT_2_10_10_10_REV");
/* 1053 */     a(32826, "GL12.GL_RESCALE_NORMAL");
/* 1054 */     a(33272, "GL12.GL_LIGHT_MODEL_COLOR_CONTROL");
/* 1055 */     a(33273, "GL12.GL_SINGLE_COLOR");
/* 1056 */     a(33274, "GL12.GL_SEPARATE_SPECULAR_COLOR");
/* 1057 */     a(33071, "GL12.GL_CLAMP_TO_EDGE");
/* 1058 */     a(33082, "GL12.GL_TEXTURE_MIN_LOD");
/* 1059 */     a(33083, "GL12.GL_TEXTURE_MAX_LOD");
/* 1060 */     a(33084, "GL12.GL_TEXTURE_BASE_LEVEL");
/* 1061 */     a(33085, "GL12.GL_TEXTURE_MAX_LEVEL");
/* 1062 */     a(33000, "GL12.GL_MAX_ELEMENTS_VERTICES");
/* 1063 */     a(33001, "GL12.GL_MAX_ELEMENTS_INDICES");
/* 1064 */     a(33901, "GL12.GL_ALIASED_POINT_SIZE_RANGE");
/* 1065 */     a(33902, "GL12.GL_ALIASED_LINE_WIDTH_RANGE");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1071 */     a(33984, "GL13.GL_TEXTURE0");
/* 1072 */     a(33985, "GL13.GL_TEXTURE1");
/* 1073 */     a(33986, "GL13.GL_TEXTURE2");
/* 1074 */     a(33987, "GL13.GL_TEXTURE3");
/* 1075 */     a(33988, "GL13.GL_TEXTURE4");
/* 1076 */     a(33989, "GL13.GL_TEXTURE5");
/* 1077 */     a(33990, "GL13.GL_TEXTURE6");
/* 1078 */     a(33991, "GL13.GL_TEXTURE7");
/* 1079 */     a(33992, "GL13.GL_TEXTURE8");
/* 1080 */     a(33993, "GL13.GL_TEXTURE9");
/* 1081 */     a(33994, "GL13.GL_TEXTURE10");
/* 1082 */     a(33995, "GL13.GL_TEXTURE11");
/* 1083 */     a(33996, "GL13.GL_TEXTURE12");
/* 1084 */     a(33997, "GL13.GL_TEXTURE13");
/* 1085 */     a(33998, "GL13.GL_TEXTURE14");
/* 1086 */     a(33999, "GL13.GL_TEXTURE15");
/* 1087 */     a(34000, "GL13.GL_TEXTURE16");
/* 1088 */     a(34001, "GL13.GL_TEXTURE17");
/* 1089 */     a(34002, "GL13.GL_TEXTURE18");
/* 1090 */     a(34003, "GL13.GL_TEXTURE19");
/* 1091 */     a(34004, "GL13.GL_TEXTURE20");
/* 1092 */     a(34005, "GL13.GL_TEXTURE21");
/* 1093 */     a(34006, "GL13.GL_TEXTURE22");
/* 1094 */     a(34007, "GL13.GL_TEXTURE23");
/* 1095 */     a(34008, "GL13.GL_TEXTURE24");
/* 1096 */     a(34009, "GL13.GL_TEXTURE25");
/* 1097 */     a(34010, "GL13.GL_TEXTURE26");
/* 1098 */     a(34011, "GL13.GL_TEXTURE27");
/* 1099 */     a(34012, "GL13.GL_TEXTURE28");
/* 1100 */     a(34013, "GL13.GL_TEXTURE29");
/* 1101 */     a(34014, "GL13.GL_TEXTURE30");
/* 1102 */     a(34015, "GL13.GL_TEXTURE31");
/* 1103 */     a(34016, "GL13.GL_ACTIVE_TEXTURE");
/* 1104 */     a(34017, "GL13.GL_CLIENT_ACTIVE_TEXTURE");
/* 1105 */     a(34018, "GL13.GL_MAX_TEXTURE_UNITS");
/* 1106 */     a(34065, "GL13.GL_NORMAL_MAP");
/* 1107 */     a(34066, "GL13.GL_REFLECTION_MAP");
/* 1108 */     a(34067, "GL13.GL_TEXTURE_CUBE_MAP");
/* 1109 */     a(34068, "GL13.GL_TEXTURE_BINDING_CUBE_MAP");
/* 1110 */     a(34069, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_X");
/* 1111 */     a(34070, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_X");
/* 1112 */     a(34071, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_Y");
/* 1113 */     a(34072, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_Y");
/* 1114 */     a(34073, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_Z");
/* 1115 */     a(34074, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_Z");
/* 1116 */     a(34075, "GL13.GL_PROXY_TEXTURE_CUBE_MAP");
/* 1117 */     a(34076, "GL13.GL_MAX_CUBE_MAP_TEXTURE_SIZE");
/* 1118 */     a(34025, "GL13.GL_COMPRESSED_ALPHA");
/* 1119 */     a(34026, "GL13.GL_COMPRESSED_LUMINANCE");
/* 1120 */     a(34027, "GL13.GL_COMPRESSED_LUMINANCE_ALPHA");
/* 1121 */     a(34028, "GL13.GL_COMPRESSED_INTENSITY");
/* 1122 */     a(34029, "GL13.GL_COMPRESSED_RGB");
/* 1123 */     a(34030, "GL13.GL_COMPRESSED_RGBA");
/* 1124 */     a(34031, "GL13.GL_TEXTURE_COMPRESSION_HINT");
/* 1125 */     a(34464, "GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE");
/* 1126 */     a(34465, "GL13.GL_TEXTURE_COMPRESSED");
/* 1127 */     a(34466, "GL13.GL_NUM_COMPRESSED_TEXTURE_FORMATS");
/* 1128 */     a(34467, "GL13.GL_COMPRESSED_TEXTURE_FORMATS");
/* 1129 */     a(32925, "GL13.GL_MULTISAMPLE");
/* 1130 */     a(32926, "GL13.GL_SAMPLE_ALPHA_TO_COVERAGE");
/* 1131 */     a(32927, "GL13.GL_SAMPLE_ALPHA_TO_ONE");
/* 1132 */     a(32928, "GL13.GL_SAMPLE_COVERAGE");
/* 1133 */     a(32936, "GL13.GL_SAMPLE_BUFFERS");
/* 1134 */     a(32937, "GL13.GL_SAMPLES");
/* 1135 */     a(32938, "GL13.GL_SAMPLE_COVERAGE_VALUE");
/* 1136 */     a(32939, "GL13.GL_SAMPLE_COVERAGE_INVERT");
/*      */     
/* 1138 */     a(34019, "GL13.GL_TRANSPOSE_MODELVIEW_MATRIX");
/* 1139 */     a(34020, "GL13.GL_TRANSPOSE_PROJECTION_MATRIX");
/* 1140 */     a(34021, "GL13.GL_TRANSPOSE_TEXTURE_MATRIX");
/* 1141 */     a(34022, "GL13.GL_TRANSPOSE_COLOR_MATRIX");
/* 1142 */     a(34160, "GL13.GL_COMBINE");
/* 1143 */     a(34161, "GL13.GL_COMBINE_RGB");
/* 1144 */     a(34162, "GL13.GL_COMBINE_ALPHA");
/* 1145 */     a(34176, "GL13.GL_SOURCE0_RGB");
/* 1146 */     a(34177, "GL13.GL_SOURCE1_RGB");
/* 1147 */     a(34178, "GL13.GL_SOURCE2_RGB");
/* 1148 */     a(34184, "GL13.GL_SOURCE0_ALPHA");
/* 1149 */     a(34185, "GL13.GL_SOURCE1_ALPHA");
/* 1150 */     a(34186, "GL13.GL_SOURCE2_ALPHA");
/* 1151 */     a(34192, "GL13.GL_OPERAND0_RGB");
/* 1152 */     a(34193, "GL13.GL_OPERAND1_RGB");
/* 1153 */     a(34194, "GL13.GL_OPERAND2_RGB");
/* 1154 */     a(34200, "GL13.GL_OPERAND0_ALPHA");
/* 1155 */     a(34201, "GL13.GL_OPERAND1_ALPHA");
/* 1156 */     a(34202, "GL13.GL_OPERAND2_ALPHA");
/* 1157 */     a(34163, "GL13.GL_RGB_SCALE");
/* 1158 */     a(34164, "GL13.GL_ADD_SIGNED");
/* 1159 */     a(34165, "GL13.GL_INTERPOLATE");
/* 1160 */     a(34023, "GL13.GL_SUBTRACT");
/* 1161 */     a(34166, "GL13.GL_CONSTANT");
/* 1162 */     a(34167, "GL13.GL_PRIMARY_COLOR");
/* 1163 */     a(34168, "GL13.GL_PREVIOUS");
/* 1164 */     a(34478, "GL13.GL_DOT3_RGB");
/* 1165 */     a(34479, "GL13.GL_DOT3_RGBA");
/* 1166 */     a(33069, "GL13.GL_CLAMP_TO_BORDER");
/*      */     
/* 1168 */     a(33169, "GL14.GL_GENERATE_MIPMAP");
/* 1169 */     a(33170, "GL14.GL_GENERATE_MIPMAP_HINT");
/* 1170 */     a(33189, "GL14.GL_DEPTH_COMPONENT16");
/* 1171 */     a(33190, "GL14.GL_DEPTH_COMPONENT24");
/* 1172 */     a(33191, "GL14.GL_DEPTH_COMPONENT32");
/* 1173 */     a(34890, "GL14.GL_TEXTURE_DEPTH_SIZE");
/* 1174 */     a(34891, "GL14.GL_DEPTH_TEXTURE_MODE");
/* 1175 */     a(34892, "GL14.GL_TEXTURE_COMPARE_MODE");
/* 1176 */     a(34893, "GL14.GL_TEXTURE_COMPARE_FUNC");
/* 1177 */     a(34894, "GL14.GL_COMPARE_R_TO_TEXTURE");
/* 1178 */     a(33872, "GL14.GL_FOG_COORDINATE_SOURCE");
/* 1179 */     a(33873, "GL14.GL_FOG_COORDINATE");
/* 1180 */     a(33874, "GL14.GL_FRAGMENT_DEPTH");
/* 1181 */     a(33875, "GL14.GL_CURRENT_FOG_COORDINATE");
/* 1182 */     a(33876, "GL14.GL_FOG_COORDINATE_ARRAY_TYPE");
/* 1183 */     a(33877, "GL14.GL_FOG_COORDINATE_ARRAY_STRIDE");
/* 1184 */     a(33878, "GL14.GL_FOG_COORDINATE_ARRAY_POINTER");
/* 1185 */     a(33879, "GL14.GL_FOG_COORDINATE_ARRAY");
/* 1186 */     a(33062, "GL14.GL_POINT_SIZE_MIN");
/* 1187 */     a(33063, "GL14.GL_POINT_SIZE_MAX");
/* 1188 */     a(33064, "GL14.GL_POINT_FADE_THRESHOLD_SIZE");
/* 1189 */     a(33065, "GL14.GL_POINT_DISTANCE_ATTENUATION");
/* 1190 */     a(33880, "GL14.GL_COLOR_SUM");
/* 1191 */     a(33881, "GL14.GL_CURRENT_SECONDARY_COLOR");
/* 1192 */     a(33882, "GL14.GL_SECONDARY_COLOR_ARRAY_SIZE");
/* 1193 */     a(33883, "GL14.GL_SECONDARY_COLOR_ARRAY_TYPE");
/* 1194 */     a(33884, "GL14.GL_SECONDARY_COLOR_ARRAY_STRIDE");
/* 1195 */     a(33885, "GL14.GL_SECONDARY_COLOR_ARRAY_POINTER");
/* 1196 */     a(33886, "GL14.GL_SECONDARY_COLOR_ARRAY");
/* 1197 */     a(32968, "GL14.GL_BLEND_DST_RGB");
/* 1198 */     a(32969, "GL14.GL_BLEND_SRC_RGB");
/* 1199 */     a(32970, "GL14.GL_BLEND_DST_ALPHA");
/* 1200 */     a(32971, "GL14.GL_BLEND_SRC_ALPHA");
/* 1201 */     a(34055, "GL14.GL_INCR_WRAP");
/* 1202 */     a(34056, "GL14.GL_DECR_WRAP");
/* 1203 */     a(34048, "GL14.GL_TEXTURE_FILTER_CONTROL");
/* 1204 */     a(34049, "GL14.GL_TEXTURE_LOD_BIAS");
/* 1205 */     a(34045, "GL14.GL_MAX_TEXTURE_LOD_BIAS");
/* 1206 */     a(33648, "GL14.GL_MIRRORED_REPEAT");
/* 1207 */     a(32773, "ARBImaging.GL_BLEND_COLOR");
/* 1208 */     a(32777, "ARBImaging.GL_BLEND_EQUATION");
/* 1209 */     a(32774, "GL14.GL_FUNC_ADD");
/* 1210 */     a(32778, "GL14.GL_FUNC_SUBTRACT");
/* 1211 */     a(32779, "GL14.GL_FUNC_REVERSE_SUBTRACT");
/* 1212 */     a(32775, "GL14.GL_MIN");
/* 1213 */     a(32776, "GL14.GL_MAX");
/*      */     
/* 1215 */     a(34962, "GL15.GL_ARRAY_BUFFER");
/* 1216 */     a(34963, "GL15.GL_ELEMENT_ARRAY_BUFFER");
/* 1217 */     a(34964, "GL15.GL_ARRAY_BUFFER_BINDING");
/* 1218 */     a(34965, "GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING");
/* 1219 */     a(34966, "GL15.GL_VERTEX_ARRAY_BUFFER_BINDING");
/* 1220 */     a(34967, "GL15.GL_NORMAL_ARRAY_BUFFER_BINDING");
/* 1221 */     a(34968, "GL15.GL_COLOR_ARRAY_BUFFER_BINDING");
/* 1222 */     a(34969, "GL15.GL_INDEX_ARRAY_BUFFER_BINDING");
/* 1223 */     a(34970, "GL15.GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING");
/* 1224 */     a(34971, "GL15.GL_EDGE_FLAG_ARRAY_BUFFER_BINDING");
/* 1225 */     a(34972, "GL15.GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING");
/* 1226 */     a(34973, "GL15.GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING");
/* 1227 */     a(34974, "GL15.GL_WEIGHT_ARRAY_BUFFER_BINDING");
/* 1228 */     a(34975, "GL15.GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING");
/* 1229 */     a(35040, "GL15.GL_STREAM_DRAW");
/* 1230 */     a(35041, "GL15.GL_STREAM_READ");
/* 1231 */     a(35042, "GL15.GL_STREAM_COPY");
/* 1232 */     a(35044, "GL15.GL_STATIC_DRAW");
/* 1233 */     a(35045, "GL15.GL_STATIC_READ");
/* 1234 */     a(35046, "GL15.GL_STATIC_COPY");
/* 1235 */     a(35048, "GL15.GL_DYNAMIC_DRAW");
/* 1236 */     a(35049, "GL15.GL_DYNAMIC_READ");
/* 1237 */     a(35050, "GL15.GL_DYNAMIC_COPY");
/* 1238 */     a(35000, "GL15.GL_READ_ONLY");
/* 1239 */     a(35001, "GL15.GL_WRITE_ONLY");
/* 1240 */     a(35002, "GL15.GL_READ_WRITE");
/* 1241 */     a(34660, "GL15.GL_BUFFER_SIZE");
/* 1242 */     a(34661, "GL15.GL_BUFFER_USAGE");
/* 1243 */     a(35003, "GL15.GL_BUFFER_ACCESS");
/* 1244 */     a(35004, "GL15.GL_BUFFER_MAPPED");
/* 1245 */     a(35005, "GL15.GL_BUFFER_MAP_POINTER");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1261 */     a(34138, "NVFogDistance.GL_FOG_DISTANCE_MODE_NV");
/* 1262 */     a(34139, "NVFogDistance.GL_EYE_RADIAL_NV");
/* 1263 */     a(34140, "NVFogDistance.GL_EYE_PLANE_ABSOLUTE_NV");
/*      */   }
/*      */   
/*      */   private static void a(int ☃, String str) {
/* 1267 */     g.merge(Integer.valueOf(☃), str, (☃, str1) -> ☃ + "/" + str1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1275 */   private static final Map<String, List<String>> j = Maps.newHashMap();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(int ☃, boolean bool) {
/* 1336 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/* 1337 */     if (☃ <= 0) {
/*      */       return;
/*      */     }
/*      */     
/* 1341 */     GLCapabilities gLCapabilities = GL.getCapabilities();
/* 1342 */     if (gLCapabilities.GL_KHR_debug) {
/* 1343 */       GL11.glEnable(37600);
/* 1344 */       if (bool) {
/* 1345 */         GL11.glEnable(33346);
/*      */       }
/* 1347 */       for (int i = 0; i < h.size(); i++) {
/* 1348 */         boolean bool1 = (i < ☃);
/* 1349 */         KHRDebug.glDebugMessageControl(4352, 4352, ((Integer)h.get(i)).intValue(), (int[])null, bool1);
/*      */       } 
/* 1351 */       KHRDebug.glDebugMessageCallback((GLDebugMessageCallbackI)GLX.make(GLDebugMessageCallback.create(del::a), dei::a), 0L);
/* 1352 */     } else if (gLCapabilities.GL_ARB_debug_output) {
/* 1353 */       if (bool) {
/* 1354 */         GL11.glEnable(33346);
/*      */       }
/* 1356 */       for (int i = 0; i < i.size(); i++) {
/* 1357 */         boolean bool1 = (i < ☃);
/* 1358 */         ARBDebugOutput.glDebugMessageControlARB(4352, 4352, ((Integer)i.get(i)).intValue(), (int[])null, bool1);
/*      */       } 
/* 1360 */       ARBDebugOutput.glDebugMessageCallbackARB((GLDebugMessageARBCallbackI)GLX.make(GLDebugMessageARBCallback.create(del::a), dei::a), 0L);
/*      */     } 
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\del.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */